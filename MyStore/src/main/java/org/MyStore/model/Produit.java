package org.MyStore.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String ref;
	private String nom;
	private String description;
	private int quantite;
	@ManyToOne
	private Categorie categorie;
	@ManyToMany
	@JoinColumn(name="PRODUIT_ID")
	private Collection<Commande> commandes;
	private Double prix;
	private String codeBare;

	public Produit(String ref, String nom, String description, int quantite, Double prix, String codeBare) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prix = prix;
		this.codeBare = codeBare;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodeBare() {
		return codeBare;
	}
	public void setCodeBare(String codeBare) {
		this.codeBare = codeBare;
	}
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

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
