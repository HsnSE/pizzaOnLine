package fr.eni.pizzaOnLine.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.pizzaOnLine.entity.Product;
import fr.eni.pizzaOnLine.entity.ProductType;
import fr.eni.pizzaOnLine.service.ProductService;
//import jakarta.annotation.PostConstruct;
import fr.eni.pizzaOnLine.service.ProductTypeService;


@Controller
@RequestMapping("/types")
public class ProductTypeController {
//	private List<Produit> lesProduits;
	
	private ProductTypeService productTypeService;
	//private ProductTypeService typeService;
	
	public ProductTypeController(ProductTypeService typeService) {
		
		productTypeService = typeService;
	}


	@GetMapping("/liste")
	public String listProduits(Model theModel) {
		List<ProductType> lesTypes = productTypeService.findAll();
		
		theModel.addAttribute("types",lesTypes);
		
		return "type/list-types";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		ProductType theType = new ProductType();

		theModel.addAttribute("type", theType);

		return "type/add-type";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("typeId") int theId,
									Model theModel) {

		ProductType theType = productTypeService.findById(theId);

		theModel.addAttribute("type", theType);

		return "produit/add-product";
	}
	
	
	@PostMapping("/save")
	public String saveProduit(@ModelAttribute("type") ProductType theType) {

		productTypeService.save(theType);
		
		return "redirect:/types/liste";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("produitId") int theId) {
		
		productTypeService.deleteById(theId);
		
		return "redirect:/types/liste";
	}
	
	
	
	
}
