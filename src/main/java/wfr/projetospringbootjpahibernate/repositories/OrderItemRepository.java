package wfr.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wfr.projetospringbootjpahibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}