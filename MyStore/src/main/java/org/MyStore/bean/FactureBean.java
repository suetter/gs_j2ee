package org.MyStore.bean;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.MyStore.model.Commande;
import org.MyStore.model.ref.StatutFacture;

public class FactureBean {

	private Long id;
	private String ref;
	private StatutFactureBean statut;
	private CommandeBean commande;
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
	public StatutFactureBean getStatut() {
		return statut;
	}
	public void setStatut(StatutFactureBean statut) {
		this.statut = statut;
	}
	public CommandeBean getCommande() {
		return commande;
	}
	public void setCommande(CommandeBean commande) {
		this.commande = commande;
	}
	public FactureBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
