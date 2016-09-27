package com.escobar.concepts.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escobar.concepts.transport.entities.User;
import com.escobar.concepts.transport.repositories.UserRepository;
import com.escobar.concepts.transport.services.UserServices;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserServices userServices;

	@RequestMapping("/user")
	public User users(@RequestParam(value = "lastName") String lastName) {
		return userRepository.findByLastName(lastName);
	}

	@RequestMapping("/login")
	public Greeting login(@RequestParam(value="email") String email,
			@RequestParam(value="password")String password) {
		return userServices.login(email, password);
	}

}
