package com.escobar.concepts.transport.repositories;

import org.springframework.data.repository.CrudRepository;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.entities.TripPK;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface TripRepository extends CrudRepository<Trip, TripPK> {

	public Trip findByDestinationSite(DestinationSite destinationSite);
}