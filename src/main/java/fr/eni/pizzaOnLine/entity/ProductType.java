package fr.eni.pizzaOnLine.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="type_produit")
public class ProductType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="libelle")
	private String libelle;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="type")
	 private Set<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductType [id=" + id + ", libelle=" + libelle + ", products=" + products + "]";
	}

	public ProductType(int id, String libelle, Set<Product> products) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.products = products;
	}
	public ProductType() {
		
	}
	
	
}
