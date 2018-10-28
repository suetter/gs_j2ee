package org.MyStore.service;


import org.MyStore.model.Produit;
import org.springframework.stereotype.Service;


public interface IProduitService {
	
	public  Produit save(Produit produit);
	public void delete(Long id);
	public Produit update(Produit produit);
	public Produit findOne(Long id);
	
	

}
