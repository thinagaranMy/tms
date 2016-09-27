package com.escobar.concepts.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.services.DestinationSiteService;
import com.escobar.concepts.transport.services.TripService;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@RestController
public class TripController {

	@Autowired
	private TripService tripService;

	@Autowired
	private DestinationSiteService destinationSiteService;

	@RequestMapping("/trip")
	public Trip findTripByDestination(@RequestParam(value = "destinationCode") String destinationCode) {
		return tripService.findTripByDestination(destinationSiteService.findDestinationSiteByCode(destinationCode));
	}
}
