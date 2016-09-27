package com.escobar.concepts.transport.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.repositories.TripRepository;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository tripRepository;

	@Override
	public Trip findTripByDestination(DestinationSite destinationSite) {
		// TODO Auto-generated method stub
		return  tripRepository.findByDestinationSite(destinationSite);
	}
	

	
}
