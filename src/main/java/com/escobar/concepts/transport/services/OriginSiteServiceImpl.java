package com.escobar.concepts.transport.services;

import java.util.List;

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

	@Override
	public List<OriginSite> findAllOriginSite() {
		return (List<OriginSite>) originSiteRepository.findAll();
	}

	@Override
	public OriginSite saveOriginSite(OriginSite originSite) {
		return originSiteRepository.save(originSite);
	}

	@Override
	public OriginSite findOriginSiteByName(String originName) {
		return originSiteRepository.findOriginSiteByName(originName);
	}

}
