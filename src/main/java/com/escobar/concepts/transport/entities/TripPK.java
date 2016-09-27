package com.escobar.concepts.transport.entities;

import java.io.Serializable;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public class TripPK implements Serializable{

	private OriginSite originSite;
	private DestinationSite destinationSite;
	
	public TripPK() {
		//  Your class must have a no-arq constructor
	}
	@Override
	
	public boolean equals(Object obj) {
		if(obj instanceof TripPK){
			TripPK tripPK = (TripPK) obj;
			if(!tripPK.originSite.getCode().equals(originSite.getCode())){
				return false;
			}
			if(!tripPK.destinationSite.getCode().equals(destinationSite.getCode())){
				return false;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return originSite.hashCode() + destinationSite.hashCode();
	}
	public OriginSite getOriginSite() {
		return originSite;
	}
	public void setOriginSite(OriginSite originSite) {
		this.originSite = originSite;
	}
	public DestinationSite getDestinationSite() {
		return destinationSite;
	}
	public void setDestinationSite(DestinationSite destinationSite) {
		this.destinationSite = destinationSite;
	}
	
	
}
