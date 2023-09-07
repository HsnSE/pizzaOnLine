package fr.eni.pizzaOnLine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.entity.OrderDetail;

@Service
public interface OrderDetailService {
	List<OrderDetail> findAll();
	
	OrderDetail findById(Long theId);
	
	void save(OrderDetail theOrderDetails);
	
	void deleteById(Long theId);
}
