package wfr.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wfr.projetospringbootjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}