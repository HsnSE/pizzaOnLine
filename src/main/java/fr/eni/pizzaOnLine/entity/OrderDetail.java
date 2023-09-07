package fr.eni.pizzaOnLine.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
    private Order order;
	
    @ManyToOne
    private Product product;

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", quantity=" + quantity + ", order=" + order + ", product=" + product + "]";
	}

	public OrderDetail(Long id, int quantity, Order order, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}
    
	public OrderDetail() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
	
    
    
}
