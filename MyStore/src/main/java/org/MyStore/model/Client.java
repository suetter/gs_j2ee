package org.MyStore.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("C")
public class Client extends Utilisateur implements Serializable{
	
	@OneToMany(mappedBy="client")
	private Collection<Commande> commandes;
	@ManyToOne
	private Employe employe;
	
	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
