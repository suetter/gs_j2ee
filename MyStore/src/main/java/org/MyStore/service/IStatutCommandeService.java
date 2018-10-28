package org.MyStore.service;

import org.MyStore.model.ref.StatutCommande;

public interface IStatutCommandeService {

	public  StatutCommande save(StatutCommande produit);
	public void delete(Long id);
	public StatutCommande update(StatutCommande produit);
	public StatutCommande findOne(Long id);
	
	
	
	
}
