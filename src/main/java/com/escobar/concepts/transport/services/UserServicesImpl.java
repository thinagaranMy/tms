package com.escobar.concepts.transport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escobar.concepts.transport.controller.Greeting;
import com.escobar.concepts.transport.entities.User;
import com.escobar.concepts.transport.repositories.UserRepository;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepository userRepository;
	
	public Greeting login(String email, String password){
		User user = userRepository.findByEmail(email);
		if (user.getPassword().equals(password))
			return new Greeting(user.getId(), user.getFirstName());
		return null;
	}
}
