package org.MyStore.service.impl;

import org.MyStore.dao.CommandeRepository;
import org.MyStore.model.Commande;
import org.MyStore.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CommandeService implements ICommandeService{

	
	@Autowired
	private CommandeRepository commandeRepo;
	
	@Override
	public Commande save(Commande commande) {
		return commandeRepo.save(commande);
	}

	@Override
	public void delete(Long id) {
		commandeRepo.deleteById(id);
		
	}

	@Override
	public Commande update(Commande commande) {
		return commandeRepo.save(commande);
	}

	@Override
	public Commande findOne(Long id) {
		return commandeRepo.getOne(id);
	}

}
