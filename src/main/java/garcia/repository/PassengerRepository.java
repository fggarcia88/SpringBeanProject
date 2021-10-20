package garcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import garcia.beans.Passenger;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
