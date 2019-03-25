package br.com.magtools.dao.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magtools.dao.entities.User;
import br.com.magtools.dao.repository.UserRepository;
import br.com.magtools.dao.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Optional<User> findByUsername(String username) {
		return repository.findByUsername(username);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public User save(User user) {
		return repository.saveAndFlush(user);
	}

	@Override
	public User update(User user) {
		return repository.saveAndFlush(user);
	}

}
