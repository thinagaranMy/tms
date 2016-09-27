package com.escobar.concepts.transport.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@Entity
public class Bas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int capacity;
	private String registrationNumber;
	
	protected Bas(){}

	public Bas(String registrationNumber, int capacity) {
		super();
		this.registrationNumber = registrationNumber;
		this.capacity = capacity;
	}

	public Long getId() {
		return id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bas [id=" + id + ", capacity=" + capacity + ", registrationNumber=" + registrationNumber + "]";
	}

	

}
