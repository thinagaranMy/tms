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
 * @author thinagaranharidass 
 * thinagaran.k.haridass@gmail.com
 *
 */
@SpringBootApplication
public class TmsApplication {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	OriginSiteRepository originSiteRepository;
	
	@Autowired
	TripRepository tripRepository;
	
	@Autowired
	DestinationSiteRepository destinationSiteRepository;

	
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
			log.info("User done");
			destinationSiteRepository.save(new DestinationSite("SBN", "SEREMBAN"));
			destinationSiteRepository.save(new DestinationSite("MLK", "MELAKA"));
			destinationSiteRepository.save(new DestinationSite("KUL", "KUALA LUMPUR"));
			destinationSiteRepository.save(new DestinationSite("PNG", "PULAU PINAG"));
			log.info("destination site done");
			
			originSiteRepository.save(new OriginSite("SBN", "SEREMBAN"));
			originSiteRepository.save(new OriginSite("MLK", "MELAKA"));
			originSiteRepository.save(new OriginSite("KUL", "KUALA LUMPUR"));
			originSiteRepository.save(new OriginSite("PNG", "PULAU PINANG"));
			log.info("origin site done");

			
			
			tripRepository.save(new Trip(originSiteRepository.findOriginSiteByCode("SBN"),destinationSiteRepository.findDestinationSiteByCode("KUL"), 60,7.20));
			tripRepository.save(new Trip(originSiteRepository.findOriginSiteByCode("SBN"),destinationSiteRepository.findDestinationSiteByCode("MLK"), 50,6.00));
			tripRepository.save(new Trip(originSiteRepository.findOriginSiteByCode("SBN"),destinationSiteRepository.findDestinationSiteByCode("PNG"), 350,45.80));
			tripRepository.save(new Trip(originSiteRepository.findOriginSiteByCode("KUL"),destinationSiteRepository.findDestinationSiteByCode("PNG"), 250,27.20));
			log.info("trip done");
			
		};
	}
}
