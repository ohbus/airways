package xyz.subho.airways.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.subho.airways.booking.entity.FlightDetails;

public interface FlightBookingRepository extends JpaRepository<FlightDetails, Long> {
	
	

}
