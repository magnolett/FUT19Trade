package br.com.magtools.dao.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magtools.dao.entities.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long>{

	Optional<Price> findByQueryTime(Date queryTime);
	
}
