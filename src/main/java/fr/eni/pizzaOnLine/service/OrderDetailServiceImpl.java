package fr.eni.pizzaOnLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.dao.OrderDetailsRepository;
import fr.eni.pizzaOnLine.entity.OrderDetail;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@Override
	public List<OrderDetail> findAll() {
		return orderDetailsRepository.findAll();
	}

	@Override
	public OrderDetail findById(Long theId) {
    Optional<OrderDetail> result = orderDetailsRepository.findById(theId);
		
		OrderDetail theOrderDetails = null;
		
		if (result.isPresent()) {
			theOrderDetails = result.get();
		}
		else {
			
			throw new RuntimeException("Did not find order id - " + theId);
		}
		
		return theOrderDetails;
		
	}

	@Override
	public void save(OrderDetail theOrderDetails) {
		
		orderDetailsRepository.save(theOrderDetails);
	}

	@Override
	public void deleteById(Long theId) {
		orderDetailsRepository.deleteById(theId);
	}
}
