package com.escobar.concepts.transport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.repositories.TripRepository;
/**
 * 
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */
@Service
public class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository tripRepository;

	@Override
	public List<Trip> findAllTrips(){
		return (List<Trip>) tripRepository.findAll();
	}
	
	@CrossOrigin
	@Override
	public List<Trip> findTripByOriginSite(OriginSite originSite) {
		return  tripRepository.findByOriginSite(originSite);
	}

	@Override
	public Trip saveTrip(Trip trip) {
		return tripRepository.save(trip);
	}

	@CrossOrigin
	@Override
	public Trip findByOriginSiteAndDestinationSite(OriginSite originSite, DestinationSite destinationSite) {
		
		return tripRepository.findByDestinationSiteAndOriginSite( destinationSite,originSite);
	}
	

	
}
