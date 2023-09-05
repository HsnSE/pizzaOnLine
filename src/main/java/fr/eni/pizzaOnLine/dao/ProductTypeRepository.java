package fr.eni.pizzaOnLine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
	
}
