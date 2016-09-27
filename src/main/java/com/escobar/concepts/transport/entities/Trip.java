package com.escobar.concepts.transport.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@Entity
@IdClass(value=TripPK.class)
public class Trip {


	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Id
	private OriginSite originSite;
	@Id
	private DestinationSite destinationSite;
	
	private int distance;
	
	private double price;

	public Trip(OriginSite originSite, DestinationSite destinationSite, int distance, double price) {
		super();
		this.originSite = originSite;
		this.destinationSite = destinationSite;
		this.distance = distance;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Trip [id=" + id + ", originSite=" + originSite + ", destinationSite=" + destinationSite + ", distance="
				+ distance + ", price=" + price + "]";
	}
	
	
	
}
