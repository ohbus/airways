package xyz.subho.airways.fare.model;

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
	private Currency currency = Currency.INR;
	private Double value;

}
