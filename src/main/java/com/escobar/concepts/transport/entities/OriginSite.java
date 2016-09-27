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

@Entity
@Table(name = "originSite")
public class OriginSite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "originSite", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Trip> trips;

	private String code;

	private String name;

	public OriginSite() {}
	public OriginSite(Set<Trip> trips, String code) {
		super();
		this.trips = trips;
		this.code = code;
	}
	public OriginSite(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public OriginSite(Set<Trip> trips, String code, String name) {
		super();
		this.trips = trips;
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
		return "OriginSite_new [id=" + id + ", code=" + code + ", name=" + name + "]";
	}

}
