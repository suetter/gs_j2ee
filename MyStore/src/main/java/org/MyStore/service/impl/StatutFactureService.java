package org.MyStore.service.impl;

import org.MyStore.dao.ref.StatutFactureRepository;
import org.MyStore.model.ref.StatutFacture;
import org.MyStore.service.IStatutFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StatutFactureService implements IStatutFactureService{

	@Autowired
	private StatutFactureRepository statutFactRepo;
	
	@Override
	public StatutFacture save(StatutFacture produit) {
		// TODO Auto-generated method stub
		return statutFactRepo.save(produit);
	}

	@Override
	public void delete(Long id) {
		statutFactRepo.deleteById(id);
		
	}

	@Override
	public StatutFacture update(StatutFacture produit) {
		return statutFactRepo.save(produit);
	}

	@Override
	public StatutFacture findOne(Long id) {
		return statutFactRepo.getOne(id);
	}

}
