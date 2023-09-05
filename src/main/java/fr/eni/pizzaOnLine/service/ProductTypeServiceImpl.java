package fr.eni.pizzaOnLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.dao.ProductRepository;
import fr.eni.pizzaOnLine.dao.ProductTypeRepository;
import fr.eni.pizzaOnLine.entity.Product;
import fr.eni.pizzaOnLine.entity.ProductType;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
private ProductTypeRepository productTypeRepository;
	
	@Autowired
	public ProductTypeServiceImpl(ProductTypeRepository theProductRepository) {
		productTypeRepository = theProductRepository;
	}

	@Override
	public List<ProductType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductType findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ProductType theProductType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
	



}
