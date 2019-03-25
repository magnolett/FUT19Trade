package br.com.magtools.dao.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magtools.dao.entities.Player;
import br.com.magtools.dao.repository.PlayerRepository;
import br.com.magtools.dao.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repository;
	
	@Override
	public Optional<Player> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Player save(Player player) {
		return repository.saveAndFlush(player);
	}

	@Override
	public Player update(Player player) {
		return repository.saveAndFlush(player);
	}

	@Override
	public Optional<Player> findByPlayerName(String playerName) {
		return repository.findByPlayerName(playerName);
	}

	@Override
	public Optional<List<Player>> findByLowestPrice(Double price) {
		return repository.findPlayersByPrice(price);
	}

	@Override
	public Optional<List<Player>> findByIsTimeToBuy(boolean isTimeToBuy) {
		return repository.findByIsTimeToBuy(isTimeToBuy);
	}

	@Override
	public List<Player> findAll() {
		return repository.findAll();
	}

}
