package com.escobar.concepts.transport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Trip findTripByOriginSite(OriginSite originSite) {
		// TODO Auto-generated method stub
		return  tripRepository.findByOriginSite(originSite);
	}
	

	
}
