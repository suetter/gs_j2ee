package org.MyStore.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ref;
	private String name;
	private String description;
	@OneToMany(mappedBy="categorie",cascade=CascadeType.ALL)
	private Collection<Produit> produits;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public Categorie(String ref, String name, String description) {
		super();
		this.ref = ref;
		this.name = name;
		this.description = description;
	}


}
