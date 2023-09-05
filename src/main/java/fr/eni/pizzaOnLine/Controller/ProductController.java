package fr.eni.pizzaOnLine.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.pizzaOnLine.dao.ProductTypeRepository;
import fr.eni.pizzaOnLine.entity.Product;
import fr.eni.pizzaOnLine.entity.ProductType;
import fr.eni.pizzaOnLine.service.ProductService;
import fr.eni.pizzaOnLine.service.ProductTypeService;
//import jakarta.annotation.PostConstruct;


@Controller
@RequestMapping("/produits")
public class ProductController {
	
	@Autowired
	private ProductService produitService;
	
	@Autowired
	private ProductTypeRepository productTypeRepository;

	public ProductController(ProductService leProduitService) {	
		produitService = leProduitService;
	}
	
	
	

		
	@GetMapping("/carte")
	public String listProduits(Model theModel) {
		List<Product> lesProduits = produitService.findAll();
		
		theModel.addAttribute("produits",lesProduits);
		
		return "produit/list-product";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Product leProduit = new Product();
		List <ProductType> listProductTypes = productTypeRepository.findAll();
		
		theModel.addAttribute("produit", leProduit);
		theModel.addAttribute("listProductTypes", listProductTypes);

		return "produit/add-product";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("produitId") Long theId,
									Model theModel) {
		List <ProductType> listProductTypes = productTypeRepository.findAll();
		
		Product leProduit = produitService.findById(theId);

		theModel.addAttribute("produit", leProduit);
		theModel.addAttribute("listProductTypes", listProductTypes);

		return "produit/add-product";
	}
	
	
	@PostMapping("/save")
	public String saveProduit(@ModelAttribute("produit") Product leProduit) {

		produitService.save(leProduit);
		
		return "redirect:/produits/carte";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("produitId") Long theId) {
		
		produitService.deleteById(theId);
		
		return "redirect:/produits/carte";
	}
	
	
	
	
}
