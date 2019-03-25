
package br.com.magtools.dao.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magtools.dao.entities.LowestPriceHistory;
import br.com.magtools.dao.repository.LowestPriceHistoryRepository;
import br.com.magtools.dao.service.LowestPriceHistoryService;

@Service
public class LowestPriceHistoryServiceImpl implements LowestPriceHistoryService {

	@Autowired
	private LowestPriceHistoryRepository repository;
	
	@Override
	public Optional<LowestPriceHistory> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public LowestPriceHistory save(LowestPriceHistory lowestPriceHistory) {
		return repository.saveAndFlush(lowestPriceHistory);
	}

	@Override
	public LowestPriceHistory update(LowestPriceHistory lowestPriceHistory) {
		return repository.saveAndFlush(lowestPriceHistory);
	}

	@Override
	public List<LowestPriceHistory> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<LowestPriceHistory> findByDate(Date date) {
		return repository.findByDate(date);
	}

}
