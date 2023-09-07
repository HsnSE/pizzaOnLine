package fr.eni.pizzaOnLine.entity;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateHeureLivraison;
	 
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateHeurePreparation;
	
	
	@OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
	
  


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateHeureLivraison() {
		return dateHeureLivraison;
	}


	public void setDateHeureLivraison(Date dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}


	public Date getDateHeurePreparation() {
		return dateHeurePreparation;
	}


	public void setDateHeurePreparation(Date dateHeurePreparation) {
		this.dateHeurePreparation = dateHeurePreparation;
	}


	


	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}


	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}


	
	public Order(Long id, Date dateHeureLivraison, Date dateHeurePreparation, List<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.dateHeureLivraison = dateHeureLivraison;
		this.dateHeurePreparation = dateHeurePreparation;
		this.orderDetails = orderDetails;
	}


	public Order() {
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", dateHeureLivraison=" + dateHeureLivraison + ", dateHeurePreparation="
				+ dateHeurePreparation + ", orderDetails=" + orderDetails + "]";
	}
	
	
	
	
}
