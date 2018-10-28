package org.MyStore.bean;

import java.util.Collection;

import javax.persistence.OneToMany;

import org.MyStore.model.Client;
import org.MyStore.model.Commande;

public class EmployeBean {

	
	private Collection<CommandeBean> commandes;
	private Collection<ClientBean> clients;
	public Collection<CommandeBean> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<CommandeBean> commandes) {
		this.commandes = commandes;
	}
	public Collection<ClientBean> getClients() {
		return clients;
	}
	public void setClients(Collection<ClientBean> clients) {
		this.clients = clients;
	}
	public EmployeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
