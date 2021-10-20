package garcia.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import garcia.beans.Passenger;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Passenger passenger() {
		Passenger bean = new Passenger();
		return bean;
	}

}
