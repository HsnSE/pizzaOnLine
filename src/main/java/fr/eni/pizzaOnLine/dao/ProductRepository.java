package fr.eni.pizzaOnLine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	//crud done
	
	public List<Product> findAllByOrderByNomAsc();

}
