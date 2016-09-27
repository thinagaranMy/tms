package com.escobar.concepts.transport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.services.DestinationSiteService;

/**
 * 
 * @author thinagaranharidass
 * thinagaran.k.haridass@gmail.com	
 */
@RestController
public class DestinationSiteController {

	@Autowired
	private DestinationSiteService destinationSiteService;
	
	@RequestMapping("/destination")
	public List<DestinationSite> findAllDestinationSite(){
		return destinationSiteService.findAllDestinationSite();
	}
	@RequestMapping("/destination/{destinationId}")
	public List<DestinationSite> findAllDestinationSite( @PathVariable Long destinationId){
		return destinationSiteService.;
	}
	
}
