package com.escobar.concepts.transport.services;

import com.escobar.concepts.transport.entities.OriginSite;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface OriginSiteService {

	OriginSite findOriginSiteByCode(String Code);
}
