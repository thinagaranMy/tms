package com.escobar.concepts.transport.repositories;

import org.springframework.data.repository.CrudRepository;

import com.escobar.concepts.transport.entities.User;
/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
public interface UserRepository extends CrudRepository<User, Long>{

	User findByLastName(String lastName);
	
	User findByEmail(String email);
}
