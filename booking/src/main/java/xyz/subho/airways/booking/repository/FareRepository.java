package xyz.subho.airways.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.subho.airways.booking.entity.Fares;

public interface FareRepository extends JpaRepository<Fares, Long> {
		
	public List<Fares> findByCurrency(String currency); 
	
	public List<Fares> findByValue(Double value);

}
