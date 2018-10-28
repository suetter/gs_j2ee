package org.MyStore.bean;

import java.util.Collection;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.MyStore.model.Categorie;
import org.MyStore.model.Commande;

public class ProduitBean {

	
	private Long id;
	private String ref;
	private String nom;
	private String description;
	private int quantite;
	private Categorie categorie;
	private Collection<CommandeBean> commandes;
	private Double prix;
	private String codeBare;
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
	public Collection<CommandeBean> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<CommandeBean> commandes) {
		this.commandes = commandes;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getCodeBare() {
		return codeBare;
	}
	public void setCodeBare(String codeBare) {
		this.codeBare = codeBare;
	}
	public ProduitBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
