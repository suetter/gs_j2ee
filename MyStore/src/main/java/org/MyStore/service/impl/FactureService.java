package org.MyStore.service.impl;

import org.MyStore.dao.FactureRepository;
import org.MyStore.model.Facture;
import org.MyStore.model.Produit;
import org.MyStore.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class FactureService implements IFactureService{

	
	
	@Autowired
	private FactureRepository factureRepo;
	
	@Override
	public Facture save(Facture facture) {
		
		return factureRepo.save(facture);
	}

	@Override
	public void delete(Long id) {
		factureRepo.deleteById(id);
		
	}

	@Override
	public Facture update(Facture facture) {
		
		return factureRepo.save(facture);
	}

	@Override
	public Facture findOne(Long id) {
		return factureRepo.getOne(id);
	}

	
	
	
	
}
