package org.MyStore.service;

import org.MyStore.model.Employe;
import org.MyStore.model.Produit;

public interface IEmployeService {

	public  Employe save(Employe produit);
	public void delete(Long id);
	public Employe update(Employe produit);
	public Employe findOne(Long id);
	
}
