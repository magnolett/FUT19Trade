package br.com.magtools.dao.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magtools.dao.entities.Price;
import br.com.magtools.dao.repository.PriceRepository;
import br.com.magtools.dao.service.PriceService;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	private PriceRepository repository;
	
	@Override
	public Optional<Price> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Price save(Price price) {
		return repository.saveAndFlush(price);
	}

	@Override
	public Price update(Price price) {
		return repository.saveAndFlush(price);
	}

	@Override
	public Optional<Price> findByQueryTime(Date queryTime) {
		return repository.findByQueryTime(queryTime);
	}

	@Override
	public List<Price> findAll() {
		return repository.findAll();
	}

}
