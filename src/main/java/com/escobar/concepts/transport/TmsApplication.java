package com.escobar.concepts.transport;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.escobar.concepts.transport.entities.DestinationSite;
import com.escobar.concepts.transport.entities.OriginSite;
import com.escobar.concepts.transport.entities.Trip;
import com.escobar.concepts.transport.entities.User;
import com.escobar.concepts.transport.repositories.DestinationSiteRepository;
import com.escobar.concepts.transport.repositories.OriginSiteRepository;
import com.escobar.concepts.transport.repositories.TripRepository;
import com.escobar.concepts.transport.repositories.UserRepository;

/**
 * 
 * @author thinagaranharidass thinagaran.k.haridass@gmail.com
 *
 */
@SpringBootApplication
public class TmsApplication {

	@Autowired
	UserRepository userRepository;
	@Autowired
	OriginSiteRepository originSiteRepository;
	@Autowired
	DestinationSiteRepository destinationSiteRepository;
	@Autowired
	TripRepository tripRepository;
	
	private Logger log = Logger.getLogger(TmsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(UserRepository userRepository) {
		return (args) -> {
			// save some users
			userRepository
					.save(new User("Thinagaran", "Haridass", "thinagaran.k.haridass@gmail.com", "GenericPassword"));
			userRepository.save(new User("RajKumar", "Batumalai", "rajkumar.batumalai@gmail.com", "GenericPassword"));
			userRepository.save(new User("Sethu", "Raaj", "sethu.raaj@gmail.com", "GenericPassword"));
			
			originSiteRepository.save(new OriginSite("SBN", "SEREMBAN"));
			destinationSiteRepository.save(new DestinationSite("KUL", "Kuala Lumpur"));
			
			//tripRepository.save(new Trip(new OriginSite("SBN", "SEREMBAN"), new DestinationSite("KUL", "Kuala Lumpur"), 60, 7.20));
			
			// Fetch all the users
			log.info("Fetching all users");
			for (User user : userRepository.findAll()) {
				log.info(user.toString());
			}
		};
	}
}
