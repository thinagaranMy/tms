package com.escobar.concepts.transport.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.TmsApplication;
import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.services.DestinationSiteService;


/**
 * 
 * @author thinagaranharidass
 * thinagaran.k.haridass@gmail.com	
 */
@RestController
@RequestMapping("/destination")
public class DestinationSiteController {

	private Logger log = Logger.getLogger(DestinationSiteController.class);

	@Autowired
	private DestinationSiteService destinationSiteService;
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public List<DestinationSite> findAllDestinationSite(){
		return destinationSiteService.findAllDestinationSite();
	}
	
	@RequestMapping(method = RequestMethod.POST,  headers = {"Content-type=application/json;charset=UTF-8"})
	public DestinationSite  add( @RequestBody DestinationSite input) {
		log.info("add new destinationsite "+ input.toString());
		return destinationSiteService.saveDestinationSite(input);
	}
	
	
	
}
