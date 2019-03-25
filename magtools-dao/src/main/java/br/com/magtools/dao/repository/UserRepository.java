package br.com.magtools.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.magtools.dao.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Query
	Optional<User> findByUsername(String username);

	@Query
	Optional<User> findByEmail(String email);
	
}
