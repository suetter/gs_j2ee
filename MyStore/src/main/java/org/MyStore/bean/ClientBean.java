package org.MyStore.bean;

import java.util.Collection;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.MyStore.model.Commande;
import org.MyStore.model.Employe;

public class ClientBean {

	
	private Collection<CommandeBean> commandes;
	private EmployeBean employe;
	public Collection<CommandeBean> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<CommandeBean> commandes) {
		this.commandes = commandes;
	}
	public EmployeBean getEmploye() {
		return employe;
	}
	public void setEmploye(EmployeBean employe) {
		this.employe = employe;
	}
	public ClientBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
