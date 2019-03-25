package br.com.magtools.dao.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import br.com.magtools.dao.entities.Price;

public interface PriceService {

	Optional<Price> findById(Long id);
	Price save(Price price);
	Price update(Price price);
	Optional<Price> findByQueryTime(Date queryTime);
	List<Price> findAll();
	
	
}
