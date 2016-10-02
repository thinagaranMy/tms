package com.escobar.concepts.transport.services;

import java.util.List;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface TripService {

	List<Trip> findAllTrips();
	Trip saveTrip(Trip trip);
	List<Trip> findTripByOriginSite(OriginSite originSite);
	Trip findByOriginSiteAndDestinationSite(OriginSite originSite, DestinationSite destinationSite);
	

}
