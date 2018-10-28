package org.MyStore.service;

import org.MyStore.model.Categorie;
import org.MyStore.model.Produit;

public interface ICategorieService {

	public  Categorie save(Categorie produit);
	public void delete(Long id);
	public Categorie update(Categorie produit);
	public Categorie findOne(Long id);
	
	
}
