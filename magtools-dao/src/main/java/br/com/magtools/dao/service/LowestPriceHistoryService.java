package br.com.magtools.dao.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import br.com.magtools.dao.entities.LowestPriceHistory;

public interface LowestPriceHistoryService {

	Optional<LowestPriceHistory> findById(Long id);
	Optional<LowestPriceHistory> findByDate(Date date);
	LowestPriceHistory save(LowestPriceHistory lowestPriceHistory);
	LowestPriceHistory update(LowestPriceHistory lowestPriceHistory);
	List<LowestPriceHistory> findAll();
	
}
