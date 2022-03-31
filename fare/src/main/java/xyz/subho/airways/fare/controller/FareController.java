package xyz.subho.airways.fare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.subho.airways.fare.model.Fares;
import xyz.subho.airways.fare.service.FareService;

@RestController
@CrossOrigin
@RequestMapping("/fare")
public class FareController {
	
	@Autowired private FareService fareService;
	
	@GetMapping("/{id}")
	public Fares getFareById(@PathVariable Long id) {
		return fareService.getFareById(id);
	}
	
	@GetMapping("/currency/{currency}")
	public List<Fares> getFaresByCurrency(@PathVariable String currency) {
		return fareService.getFaresByCurrency(currency);
	}
	
	@GetMapping("/value/{value}")
	public List<Fares> getFaresByValue(@PathVariable Double value) {
		return fareService.getFaresByValue(value);
	}
	
	@PostMapping
	public Fares saveFare(@RequestBody Fares fare) {
		return fareService.saveFare(fare);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteFares(@PathVariable Long id) {
		fareService.deleteFares(id);
		return HttpStatus.OK;
	}
}
