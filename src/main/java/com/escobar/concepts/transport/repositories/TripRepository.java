package com.escobar.concepts.transport.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
/**
 * 
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */
public interface TripRepository extends CrudRepository<Trip, Long> {

	public List<Trip> findByOriginSite(OriginSite originSite);
	
	public Trip findByDestinationSiteAndOriginSite( DestinationSite destinationSite, OriginSite originSite);
}