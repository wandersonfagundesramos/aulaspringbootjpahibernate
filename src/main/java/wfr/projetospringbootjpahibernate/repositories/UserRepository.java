package wfr.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wfr.projetospringbootjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}