package org.MyStore.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("E")
public class Employe extends Utilisateur implements Serializable {
	
	@OneToMany(mappedBy="employe")
	private Collection<Commande> commandes;
	@OneToMany(mappedBy="employe")
	private Collection<Client> clients;
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	public Collection<Client> getClients() {
		return clients;
	}
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
