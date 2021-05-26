package wfr.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wfr.projetospringbootjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}