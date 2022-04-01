package xyz.subho.airways.booking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.subho.airways.booking.entity.Fares;
import xyz.subho.airways.booking.repository.FareRepository;
import xyz.subho.airways.booking.service.FareService;

@Service
public class FareServiceImpl implements FareService {

	@Autowired private FareRepository fareRepository;
	
	@Override
	public Fares getFareById(Long id) {
		return fareRepository.findById(id).get();
	}

	@Override
	public List<Fares> getFaresByCurrency(String currency) {
		return fareRepository.findByCurrency(currency);
	}

	@Override
	public List<Fares> getFaresByValue(Double value) {
		return fareRepository.findByValue(value);
	}

	@Override
	public Fares saveFare(Fares fare) {
		return fareRepository.save(fare);
	}

	@Override
	public void deleteFares(Long id) {
		fareRepository.deleteById(id);		
	}
}
