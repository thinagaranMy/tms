package com.escobar.concepts.transport.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * 
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "originSite_id")
	@JsonBackReference
	private OriginSite originSite;

	@ManyToOne
	@JoinColumn(name = "destinationSite_id")
	@JsonBackReference
	private DestinationSite destinationSite;

	private int distance;

	private double price;

	public Trip() {}

	public Trip(OriginSite originSite, int distance, double price) {
		super();

		this.originSite = originSite;
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
		return "Trip_new [id=" + id + ", originSite=" + originSite + ", distance=" + distance + ", price=" + price
				+ "]";
	}

}
