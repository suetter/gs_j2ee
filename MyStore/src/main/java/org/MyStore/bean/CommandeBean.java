package org.MyStore.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.MyStore.model.Client;
import org.MyStore.model.Employe;
import org.MyStore.model.Facture;
import org.MyStore.model.Produit;
import org.MyStore.model.ref.StatutCommande;

public class CommandeBean {

	
	private Long id;
	private String ref;
	private Double totalPrix;
	private Collection<ProduitBean> produits;
	private StatutCommandeBean statut;
	private FactureBean facture;
	private ClientBean client;
	private EmployeBean employe;
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
	public Collection<ProduitBean> getProduits() {
		return produits;
	}
	public void setProduits(Collection<ProduitBean> produits) {
		this.produits = produits;
	}
	public StatutCommandeBean getStatut() {
		return statut;
	}
	public void setStatut(StatutCommandeBean statut) {
		this.statut = statut;
	}
	public FactureBean getFacture() {
		return facture;
	}
	public void setFacture(FactureBean facture) {
		this.facture = facture;
	}
	public ClientBean getClient() {
		return client;
	}
	public void setClient(ClientBean client) {
		this.client = client;
	}
	public EmployeBean getEmploye() {
		return employe;
	}
	public void setEmploye(EmployeBean employe) {
		this.employe = employe;
	}
	public CommandeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
