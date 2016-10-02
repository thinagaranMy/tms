package com.escobar.concepts.transport.services;

import java.util.List;

import com.escobar.concepts.transport.entities.OriginSite;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface OriginSiteService {

	OriginSite findOriginSiteByCode(String Code);
	OriginSite findOriginSiteByName(String originName);
	OriginSite saveOriginSite(OriginSite originSite);
	List<OriginSite> findAllOriginSite();
}
