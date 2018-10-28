package org.MyStore.service;

import org.MyStore.model.Commande;
import org.MyStore.model.Produit;

public interface ICommandeService {

	public  Commande save(Commande commande);
	public void delete(Long id);
	public Commande update(Commande commande);
	public Commande findOne(Long id);
	
	
}
