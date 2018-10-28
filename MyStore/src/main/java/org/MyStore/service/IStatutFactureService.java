package org.MyStore.service;


import org.MyStore.model.ref.StatutFacture;

public interface IStatutFactureService {

	public  StatutFacture save(StatutFacture produit);
	public void delete(Long id);
	public StatutFacture update(StatutFacture produit);
	public StatutFacture findOne(Long id);
	
	
}
