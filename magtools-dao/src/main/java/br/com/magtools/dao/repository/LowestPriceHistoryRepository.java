package br.com.magtools.dao.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.magtools.dao.entities.LowestPriceHistory;

@Repository
public interface LowestPriceHistoryRepository extends JpaRepository<LowestPriceHistory, Long>{

	@Query
	Optional<LowestPriceHistory> findByDate(Date date);

}
