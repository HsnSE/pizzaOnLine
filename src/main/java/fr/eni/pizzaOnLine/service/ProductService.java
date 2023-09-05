package fr.eni.pizzaOnLine.service;

import java.util.List;

import fr.eni.pizzaOnLine.entity.Product;

public interface ProductService {
	
	List<Product> findAll();
	
	Product findById(Long theId);
	
	void save(Product theProduct);
	
	void deleteById(Long theId);
}
