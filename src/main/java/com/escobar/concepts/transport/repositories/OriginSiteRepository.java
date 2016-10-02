package com.escobar.concepts.transport.repositories;

import org.springframework.data.repository.CrudRepository;

import com.escobar.concepts.transport.entities.OriginSite;

/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface OriginSiteRepository extends CrudRepository<OriginSite, Long> {
	OriginSite findOriginSiteByCode(String code);
	OriginSite findOriginSiteByName(String name);
}
