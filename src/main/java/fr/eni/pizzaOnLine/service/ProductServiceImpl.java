package fr.eni.pizzaOnLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.dao.ProductRepository;
import fr.eni.pizzaOnLine.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(ProductRepository theProductRepository) {
		productRepository = theProductRepository;
	}
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAllByOrderByNomAsc();
	}

	@Override
	public Product findById(Long theId) {
		Optional<Product> result = productRepository.findById(theId);
		
		Product leProduit = null;
		
		if (result.isPresent()) {
			leProduit = result.get();
		}
		else {
			
			throw new RuntimeException("Did not find product id - " + theId);
		}
		
		return leProduit;
	}

	@Override
	public void save(Product theProduct) {
		productRepository.save(theProduct);
	}

	@Override
	public void deleteById(Long theId) {
		productRepository.deleteById(theId);
	}


}
