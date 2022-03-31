package xyz.subho.airways.fare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.subho.airways.fare.model.Fares;

public interface FareRepository extends JpaRepository<Fares, Long> {
		
	public List<Fares> findByCurrency(String currency); 
	
	public List<Fares> findByValue(Double value);

}
