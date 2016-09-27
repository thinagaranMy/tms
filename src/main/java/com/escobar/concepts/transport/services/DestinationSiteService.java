package com.escobar.concepts.transport.services;

import java.util.List;

import com.escobar.concepts.transport.entities.DestinationSite;

public interface DestinationSiteService {
	
	DestinationSite findDestinationSiteByCode(String code);
	
	DestinationSite saveDestinationSite(DestinationSite destinationSite);

	List<DestinationSite> findAllDestinationSite();
	
	DestinationSite findDestinationSiteById(Long id) ;
}
