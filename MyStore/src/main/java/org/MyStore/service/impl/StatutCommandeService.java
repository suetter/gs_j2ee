package org.MyStore.service.impl;

import org.MyStore.dao.ref.StatutCommandeRepository;
import org.MyStore.model.ref.StatutCommande;
import org.MyStore.service.IStatutCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StatutCommandeService implements IStatutCommandeService{

	@Autowired
	private StatutCommandeRepository statutComRepo;
	
	@Override
	public StatutCommande save(StatutCommande produit) {
		// TODO Auto-generated method stub
		return statutComRepo.save(produit);
	}

	@Override
	public void delete(Long id) {
		statutComRepo.deleteById(id);
		
	}

	@Override
	public StatutCommande update(StatutCommande produit) {
		// TODO Auto-generated method stub
		return statutComRepo.save(produit);
	}

	@Override
	public StatutCommande findOne(Long id) {
		// TODO Auto-generated method stub
		return statutComRepo.getOne(id);
	}

}
