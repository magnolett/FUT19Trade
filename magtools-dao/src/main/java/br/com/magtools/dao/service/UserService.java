package br.com.magtools.dao.service;

import java.util.Optional;

import br.com.magtools.dao.entities.User;

public interface UserService {

	Optional<User> findById(Long id);
	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);
	User save(User user);
	User update(User user);
	
}
