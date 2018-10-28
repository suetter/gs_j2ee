package org.MyStore.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.MyStore.model.Produit;

public class CategorieBean {

	
	private Long id;
	private String ref;
	private String name;
	private String description;
	private Collection<ProduitBean> produits;
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
	public Collection<ProduitBean> getProduits() {
		return produits;
	}
	public void setProduits(Collection<ProduitBean> produits) {
		this.produits = produits;
	}
	public CategorieBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
