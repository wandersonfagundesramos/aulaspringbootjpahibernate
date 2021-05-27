package wfr.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wfr.projetospringbootjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}