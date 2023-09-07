package fr.eni.pizzaOnLine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.Order;
import fr.eni.pizzaOnLine.entity.OrderDetail;


public interface OrderRepository extends JpaRepository<Order, Long>{

	List<OrderDetail> findOrderDetailsById(Long orderId);
}
