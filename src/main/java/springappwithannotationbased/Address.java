package springappwithannotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("address")
@PropertySource("classpath:application.properties")
public class Address {
	@Value("${street}")
	private String street;
	@Value("${city}")
	private String city;
	@Value("${state}")
	private String state;

	public Address() {
		System.out.println("--Address object is created--");
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
