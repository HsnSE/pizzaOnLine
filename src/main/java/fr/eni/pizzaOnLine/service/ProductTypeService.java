package fr.eni.pizzaOnLine.service;

import java.util.List;

import fr.eni.pizzaOnLine.entity.ProductType;



public interface ProductTypeService {
	List<ProductType> findAll();
	
	ProductType findById(int theId);
	
	void save(ProductType theProductType);
	
	void deleteById(int theId);
}
