package org.MyStore.service.impl;

import org.MyStore.dao.ClientRepository;
import org.MyStore.model.Client;
import org.MyStore.model.Produit;
import org.MyStore.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService implements IClientService{

	
	@Autowired
	private ClientRepository clientRepo;
	
	
	@Override
	public Client save(Client produit) {
		return clientRepo.save(produit);
	}

	@Override
	public void delete(Long id) {
		clientRepo.deleteById(id);
		
	}

	@Override
	public Client update(Client produit) {
		
		return clientRepo.save(produit);
	}

	@Override
	public Client findOne(Long id) {
		return clientRepo.getOne(id);
	}

	
	
	
}
