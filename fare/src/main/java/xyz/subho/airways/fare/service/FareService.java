package xyz.subho.airways.fare.service;

import java.util.List;

import xyz.subho.airways.fare.model.Fares;

public interface FareService {
	
	public Fares getFareById(Long id);
	
	public List<Fares> getFaresByCurrency(String currency);
	
	public List<Fares> getFaresByValue(Double value);
	
	public Fares saveFare(Fares fare);
	
	public void deleteFares(Long id);
	
}
