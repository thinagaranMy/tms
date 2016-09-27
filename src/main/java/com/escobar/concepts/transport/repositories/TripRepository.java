package com.escobar.concepts.transport.repositories;

import org.springframework.data.repository.CrudRepository;

import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
/**
 * 
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */
public interface TripRepository extends CrudRepository<Trip, Long> {

	public Trip findByOriginSite(OriginSite originSite);
}