package xyz.subho.airways.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Fares {
	
	@Id
	@GeneratedValue
	private Long id;	
	private String currency;
	private Double value;

}
