package com.escobar.concepts.transport.repositories;

import org.springframework.data.repository.CrudRepository;

import com.escobar.concepts.transport.entities.DestinationSite;

public interface DestinationSiteRepository extends CrudRepository<DestinationSite, Long> {
	DestinationSite findDestinationSiteByCode(String Code);
}
