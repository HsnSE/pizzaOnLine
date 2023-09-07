package fr.eni.pizzaOnLine.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.pizzaOnLine.dao.ProductTypeRepository;
import fr.eni.pizzaOnLine.entity.OrderDetail;
import fr.eni.pizzaOnLine.entity.Product;
import fr.eni.pizzaOnLine.service.ProductService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private ProductService produitService;
	
	@Autowired
	private ProductTypeRepository productTypeRepository;

	public HomeController(ProductService leProduitService) {	
		produitService = leProduitService;
	}
	
	
	
	@GetMapping("")
	public String listProduits(Model theModel) {
		List<Product> lesProduits = produitService.findAll();
		
		theModel.addAttribute("products",lesProduits);
		
		return "index";
	}
	
	 @GetMapping("my-cart")
	    public String myCart(Model theModel) {
		 List<Product> lesProduits = produitService.findAll();
		theModel.addAttribute("products",lesProduits);
		
		return "cart";
	    }
}
