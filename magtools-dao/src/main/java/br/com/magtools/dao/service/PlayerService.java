package br.com.magtools.dao.service;

import java.util.List;
import java.util.Optional;

import br.com.magtools.dao.entities.Player;

public interface PlayerService {

	Optional<Player> findById(Long id);
	Player save(Player player);
	Player update(Player player);
	Optional<Player> findByPlayerName(String playerName);
	Optional<List<Player>> findByLowestPrice(Double price);
	Optional<List<Player>> findByIsTimeToBuy(boolean isTimeToBuy);
	List<Player> findAll();
	
}
