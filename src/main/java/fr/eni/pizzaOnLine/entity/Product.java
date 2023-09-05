package fr.eni.pizzaOnLine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="produit")
public class Product {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(length=120, name="nom", nullable = false ,unique = true)
	private String nom;
	
	@ManyToOne
    private ProductType type;

	@Column(name="description")
	private String description;
	
	@Column(name="prix")
	private float prix;
	
	@Column(name="url_image")
	private String urlImage;

	//getters and setters
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Product() {
	}
	
	public Product(Long id ,String nom, String description, float prix, String urlImage) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
	}
	

	public Product(String nom, String description, float prix, String urlImage) {
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
	}


	



	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", urlImage="
				+ urlImage + "]";
	}
	
	
	
	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}
	

 
}
