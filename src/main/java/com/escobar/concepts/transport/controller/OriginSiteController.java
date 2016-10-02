package com.escobar.concepts.transport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.services.OriginSiteService;

@RestController
@RequestMapping("originSite")
public class OriginSiteController {
	
	@Autowired
	private OriginSiteService originSiteService;
	
	@RequestMapping(method = RequestMethod.POST)
	public OriginSite add(@RequestBody OriginSite originSite){
		return originSiteService.saveOriginSite(originSite);
	}
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public List<OriginSite> findAllOriginSite(){
		return originSiteService.findAllOriginSite();
	}
}
