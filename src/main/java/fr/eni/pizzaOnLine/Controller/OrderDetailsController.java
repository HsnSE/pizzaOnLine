package fr.eni.pizzaOnLine.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.pizzaOnLine.entity.Order;
import fr.eni.pizzaOnLine.entity.OrderDetail;

import fr.eni.pizzaOnLine.service.OrderDetailService;
import fr.eni.pizzaOnLine.service.OrderService;
import fr.eni.pizzaOnLine.service.ProductService;

@Controller
@RequestMapping("/cart")
public class OrderDetailsController {
	
	@Autowired
	private OrderDetailService orderDetailService;
	
	@Autowired
	private OrderService orderService;
	
	public OrderDetailsController(OrderDetailService theOrderDetailsService, OrderService theOrderService) {	
		orderDetailService = theOrderDetailsService;
		orderService = theOrderService;
	}
	
	
	   @GetMapping
	    public String viewCart(Model model) {
	        List<OrderDetail> orderDetails = orderService.findOrderDetailsByOrderId((long) 5);
	        model.addAttribute("orderDetails", orderDetails);
	        return "show-cart";
	    }
	   
	  

//	    @PostMapping
//	    public String addToCart(@RequestParam String productName, @RequestParam int quantity) {
//	    	orderDetails.addToCart(productName, quantity);
//	        return "redirect:/cart";
//	    }

//	    @GetMapping("/{id}/edit")
//	    public String editCartItem(@PathVariable Long id, Model model) {
//	    	OrderDetail orderDetail = orderDetail.getCartItem(id);
//	        model.addAttribute("orderDetail", orderDetail);
//	        return "edit-cart-item";
//	    }

//	    @GetMapping("/{id}/delete")
//	    public String deleteCartItem(@PathVariable Long id) {
//	    	orderDetailService.deleteItem(id);
//	        return "redirect:/cart";
//	    }
	

}
