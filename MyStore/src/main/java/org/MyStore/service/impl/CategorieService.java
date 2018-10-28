package org.MyStore.service.impl;

import org.MyStore.dao.CategorieRepository;
import org.MyStore.model.Categorie;
import org.MyStore.service.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategorieService implements ICategorieService {

	
	@Autowired
	private CategorieRepository categorieRepo;
	
	
	@Override
	public Categorie save(Categorie produit) {
		return categorieRepo.save(produit);
	}

	@Override
	public void delete(Long id) {
		categorieRepo.deleteById(id);
		
	}

	@Override
	public Categorie update(Categorie produit) {
		
		return categorieRepo.save(produit);
	}

	@Override
	public Categorie findOne(Long id) {
		return categorieRepo.getOne(id);
	}

}
