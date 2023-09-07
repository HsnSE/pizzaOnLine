package fr.eni.pizzaOnLine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.dao.OrderRepository;
import fr.eni.pizzaOnLine.entity.Order;
import fr.eni.pizzaOnLine.entity.OrderDetail;




@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order findById(Long theId) {
    Optional<Order> result = orderRepository.findById(theId);
		
		Order theOrder = null;
		
		if (result.isPresent()) {
			theOrder = result.get();
		}
		else {
			
			throw new RuntimeException("Did not find order id - " + theId);
		}
		
		return theOrder;
		
	}

	@Override
	public void save(Order theOrder) {
		
		orderRepository.save(theOrder);
	}

	@Override
	public void deleteById(Long theId) {
		orderRepository.deleteById(theId);
	}

	
	
	@Override
	public List<OrderDetail> findOrderDetailsByOrderId(Long orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);

        if (order != null) {
            return order.getOrderDetails();
        } else {
            return new ArrayList<>(); // Return an empty list if the order is not found.
        }
    }
	


}
