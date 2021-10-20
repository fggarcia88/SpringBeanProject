package garcia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import garcia.controller.BeanConfiguration;
import garcia.beans.Passenger;
import garcia.repository.PassengerRepository;

@SpringBootApplication
public class SpringBeanProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanProjectApplication.class, args);
	}
	
	@Autowired
	PassengerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		// Using an existing bean
		Passenger p = appContext.getBean("passenger", Passenger.class);
		p.setFirstName("Fernando");
		p.setLastName("Garcia");
		repo.save(p);
		
		((AbstractApplicationContext) appContext).close();		
	}

}
