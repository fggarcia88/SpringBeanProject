package garcia.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String departureCity;
	private String destinationCity;
	private int planesToDestination;
	
	public Passenger() {
		super();
	}

	public Passenger(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Passenger(String firstName, String lastName, String departureCity, String destinationCity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
	}

	public Passenger(String firstName, String lastName, String departureCity, String destinationCity,
			int planesToDestination) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.planesToDestination = planesToDestination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getPlanesToDestination() {
		return planesToDestination;
	}

	public void setPlanesToDestination(int planesToDestination) {
		this.planesToDestination = planesToDestination;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", departureCity="
				+ departureCity + ", destinationCity=" + destinationCity + ", planesToDestination="
				+ planesToDestination + "]";
	}
	
	
	
	
}
