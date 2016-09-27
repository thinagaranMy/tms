package com.escobar.concepts.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.services.OriginSiteService;
import com.escobar.concepts.transport.services.TripService;
/**
 * 
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */
@RestController
public class TripController {

	@Autowired
	private TripService tripService;

	@Autowired
	private OriginSiteService originSiteService;

	@RequestMapping("/trip")
	public Trip findTripByDestination(@RequestParam(value = "originCode") String originCode) {
		OriginSite os = originSiteService.findOriginSiteByCode(originCode);
		System.out.println("Oringin site found" + os.getCode());
		Trip trip=   tripService.findTripByOriginSite(os);
		System.out.println("trip found >>>>"+ trip.getPrice());
		return trip;
	}
}
