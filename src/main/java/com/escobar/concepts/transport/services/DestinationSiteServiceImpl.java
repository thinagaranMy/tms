package com.escobar.concepts.transport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.repositories.DestinationSiteRepository;

@Service
public class DestinationSiteServiceImpl implements DestinationSiteService{

	@Autowired
	private DestinationSiteRepository destinationSiteRepository;
	
	@Override
	public DestinationSite findDestinationSiteByCode(String code) {
		return destinationSiteRepository.findDestinationSiteByCode(code);
	}

	@Override
	public DestinationSite saveDestinationSite(DestinationSite destinationSite) {
		 return destinationSiteRepository.save(destinationSite);
		
	}

	@Override
	public List<DestinationSite> findAllDestinationSite() {
		// TODO Auto-generated method stub
		return (List<DestinationSite>) destinationSiteRepository.findAll();
	}

	@Override
	public DestinationSite findDestinationSiteById(Long id) {
		// TODO Auto-generated method stub
		return destinationSiteRepository.findOne(id);
	}

	@Override
	public DestinationSite findDestinationSiteByName(String name) {
		return destinationSiteRepository.findDestinationSiteByName(name);
	}
	
}
