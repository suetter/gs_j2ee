package org.MyStore.service.impl;

import org.MyStore.dao.ProduitRepository;
import org.MyStore.model.Produit;
import org.MyStore.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProduitService implements IProduitService{

	
	@Autowired
	private ProduitRepository produitRepo;
	
	
	@Override
	public Produit save(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepo.save(produit);
	}

	@Override
	public void delete(Long id) {
		produitRepo.deleteById(id);
		
	}

	@Override
	public Produit update(Produit produit) {
		
		return produitRepo.save(produit);
	}

	@Override
	public Produit findOne(Long id) {
		
		return produitRepo.getOne(id);
	}

}
