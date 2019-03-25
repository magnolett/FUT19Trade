package br.com.magtools.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.magtools.dao.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

	@Query
	Optional<List<Player>> findPlayersByPrice(Double price);

	@Query
	Optional<Player> findByPlayerName(String name);

	@Query
	Optional<List<Player>> findByIsTimeToBuy(boolean isTimeToBuy);
}
