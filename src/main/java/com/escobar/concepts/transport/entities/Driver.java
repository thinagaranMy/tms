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
public class Driver {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String Name;
	
	private String phoneNumber;

	protected Driver(){}
	
	public Driver(String name, String phoneNumber) {
		super();
		Name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Driver [Name=" + Name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
