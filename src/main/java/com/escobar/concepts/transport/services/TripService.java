package com.escobar.concepts.transport.services;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.Trip;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface TripService {

	Trip findTripByDestination(DestinationSite destinationSite);

}
