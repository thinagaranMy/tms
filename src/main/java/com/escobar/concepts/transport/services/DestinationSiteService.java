package com.escobar.concepts.transport.services;

import com.escobar.concepts.transport.entities.DestinationSite;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface DestinationSiteService {

	DestinationSite findDestinationSiteByCode(String Code);
}
