package com.escobar.concepts.transport.services;


import com.escobar.concepts.transport.controller.Greeting;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface UserServices {
	public Greeting login(String email, String password);
}
