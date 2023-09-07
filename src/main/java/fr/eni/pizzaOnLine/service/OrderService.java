package fr.eni.pizzaOnLine.service;

import java.util.List;

import fr.eni.pizzaOnLine.entity.Order;
import fr.eni.pizzaOnLine.entity.OrderDetail;
import fr.eni.pizzaOnLine.entity.Product;

public interface OrderService {
	List<Order> findAll();
	
	Order findById(Long theId);
	
	void save(Order theOrder);
	
	void deleteById(Long theId);
	
	List<OrderDetail> findOrderDetailsByOrderId(Long orderId);
	
}
