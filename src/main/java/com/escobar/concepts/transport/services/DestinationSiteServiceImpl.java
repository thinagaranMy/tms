package com.escobar.concepts.transport.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.repositories.DestinationSiteRepository;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public class DestinationSiteServiceImpl implements DestinationSiteService{

	@Autowired
	private DestinationSiteRepository destinationSiteRepository;
	
	@Override
	public DestinationSite findDestinationSiteByCode(String code) {
		return destinationSiteRepository.findDestinationSiteByCode(code);
	}

}
