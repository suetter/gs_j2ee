package org.MyStore.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.MyStore.model.ref.StatutCommande;

@Entity
public class Commande implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ref;
	private Double totalPrix;
	@ManyToMany
	@JoinColumn(name="COMMANDE_ID")
	private Collection<Produit> produits;
	@ManyToOne
	private StatutCommande statut;
	@OneToOne(cascade=CascadeType.ALL)
	private Facture facture;
	@ManyToOne
	private Client client;
	@ManyToOne
	private Employe employe;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(String ref, Double totalPrix) {
		super();
		this.ref = ref;
		this.totalPrix = totalPrix;
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
	public Double getTotalPrix() {
		return totalPrix;
	}
	public void setTotalPrix(Double totalPrix) {
		this.totalPrix = totalPrix;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public StatutCommande getStatut() {
		return statut;
	}
	public void setStatut(StatutCommande statut) {
		this.statut = statut;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
	
	

}
