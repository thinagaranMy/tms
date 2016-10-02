package com.escobar.concepts.transport.controller;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.services.DestinationSiteService;
import com.escobar.concepts.transport.services.OriginSiteService;
import com.escobar.concepts.transport.services.TripService;

/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@RestController
@RequestMapping("/trip")
public class TripController {

	@Autowired
	private TripService tripService;

	@Autowired
	private OriginSiteService originSiteService;

	@Autowired
	private DestinationSiteService destinationSiteService;

	private Logger log = Logger.getLogger(TripController.class);

	@RequestMapping(method = RequestMethod.GET)
	public List<Trip> findAllTrips() {
		return tripService.findAllTrips();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Trip add(@RequestBody Trip trip) {
		return tripService.saveTrip(trip);
	}

	@CrossOrigin
	@RequestMapping(value = "/originCode", method = RequestMethod.GET)
	public List<Trip> findTripByOriginCode(@RequestParam(value = "originCode") String originCode) {
		OriginSite os = originSiteService.findOriginSiteByCode(originCode);
		System.out.println("Oringin site found" + os.getCode());
		List<Trip> trip = tripService.findTripByOriginSite(os);
		System.out.println("trip found >>>> Number of trips:" + trip.size());
		return trip;
	}

	@CrossOrigin
	@RequestMapping(value = "/originName", method = RequestMethod.GET)
	public List<Trip> findTripByOriginName(@RequestParam(value = "originName") String originName) {
		log.info("origin name :" + originName);
		if (originName != "") {
			log.info("origin name is not \"\"");
			OriginSite os = originSiteService.findOriginSiteByName(originName);
			System.out.println("Oringin site found" + os.getCode());
			List<Trip> trip = tripService.findTripByOriginSite(os);
			System.out.println("trip found >>>> Number of trips:" + trip.size());
			return trip;
		}
		log.info("origin name is  \"\"");

		return null;
	}

	@CrossOrigin
	@RequestMapping(value = "/originNameDestinations", method = RequestMethod.GET)
	public List<DestinationSite> findDestinationsByOrigin(@RequestParam(value = "originName") String originName) {
		if (originName != "" || originName != null) {
			OriginSite os = originSiteService.findOriginSiteByName(originName);
			List<Trip> trip = tripService.findTripByOriginSite(os);

			List<DestinationSite> destinationSites = new LinkedList<DestinationSite>();
			for (Trip eachTrip : trip) {
				destinationSites.add(eachTrip.getDestinationSite());
			}
			return destinationSites;
		}
		return null;
	}

	@CrossOrigin
	@RequestMapping(value = "/originAndDestination", method = RequestMethod.GET)
	public Trip findTripByOriginAndDestination(@RequestParam(value = "origin") String originName,
			@RequestParam(value = "destination") String destinationName) {
		log.info("Origin Name " + originName);
		log.info("Destination Name " + destinationName);

		OriginSite os = originSiteService.findOriginSiteByName(originName);
		log.info("Origin site found with code " + os.getCode());
		DestinationSite ds = destinationSiteService.findDestinationSiteByName(destinationName);
		log.info("Destination site found with code " + ds.getCode());

		return tripService.findByOriginSiteAndDestinationSite(os, ds);
	}
}
