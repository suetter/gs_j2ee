package org.MyStore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.MyStore.model.ref.StatutFacture;

@Entity
public class Facture implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ref;
	@ManyToOne
	private StatutFacture statut;
	@OneToOne
	private Commande commande;
	
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
	public StatutFacture getStatut() {
		return statut;
	}
	public void setStatut(StatutFacture statut) {
		this.statut = statut;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(String ref) {
		super();
		this.ref = ref;
	}
	
	

}
