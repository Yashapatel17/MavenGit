package comp.spring.assignment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository  extends  JpaRepository<Passenger,Integer>{
	
	List<Passenger> findByEmail(String email);

}
