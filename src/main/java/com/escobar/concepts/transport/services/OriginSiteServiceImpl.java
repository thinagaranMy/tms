package com.escobar.concepts.transport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.repositories.OriginSiteRepository;
/**
 * 
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */
@Service
public class OriginSiteServiceImpl implements OriginSiteService{

	@Autowired
	private OriginSiteRepository originSiteRepository;
	
	@Override
	public OriginSite findOriginSiteByCode(String code) {
		return originSiteRepository.findOriginSiteByCode(code);
	}

}
