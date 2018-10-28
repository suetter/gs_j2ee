package org.MyStore.service;

import org.MyStore.model.Facture;
import org.MyStore.model.Produit;


public interface IFactureService {

	public  Facture save(Facture facture);
	public void delete(Long id);
	public Facture update(Facture produit);
	public Facture findOne(Long id);
}
