package xyz.subho.airways.booking.service;

import java.util.List;

import xyz.subho.airways.booking.entity.Fares;

public interface FareService {
	
	public Fares getFareById(Long id);
	
	public List<Fares> getFaresByCurrency(String currency);
	
	public List<Fares> getFaresByValue(Double value);
	
	public Fares saveFare(Fares fare);
	
	public void deleteFares(Long id);
	
}
