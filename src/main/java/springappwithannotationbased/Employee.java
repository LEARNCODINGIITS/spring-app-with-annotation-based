package springappwithannotationbased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:application.properties")
public class Employee {
	private int id;
	private String name;
	private double salary;
    private List<Long> mno;
    @Autowired
    private Address address;//Has-A relationship
	public Employee() {
		System.out.println("--Employee object is created---");
	}

	@Value("${id}")
	public void setId(int id) {
		this.id = id;
		System.out.println("--setter method is invoked--");
	}

	@Value("${name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("${salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setMno(List<Long> mno) {
		this.mno = mno;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mno=" + mno + ", address=" + address
				+ "]";
	}

	 
}
