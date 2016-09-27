package com.escobar.concepts.transport.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * 
 * @author thinagaranharidass
 * thinagaran.k.haridass@gmail.com	
 */
@Entity
@Table(name = "destinationSite")
public class DestinationSite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "destinationSite", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Trip> trips;
	
	private String code;

	private String name;

	public DestinationSite() {}

	public DestinationSite(Long id, Set<Trip> trips, String code, String name) {
		super();
		this.id = id;
		this.trips = trips;
		this.code = code;
		this.name = name;
	}
	
	public DestinationSite(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Trip> getTrips() {
		return trips;
	}

	public void setTrips(Set<Trip> trips) {
		this.trips = trips;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DestinationSite [id=" + id + ", trips=" + trips + ", code=" + code + ", name=" + name + "]";
	}
}
	
	
