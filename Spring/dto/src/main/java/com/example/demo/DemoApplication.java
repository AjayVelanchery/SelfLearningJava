package com.example.demo;

import com.example.demo.model.Location;
import com.example.demo.model.User;
import com.example.demo.repostiory.LocationRepository;
import com.example.demo.repostiory.UserRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@Autowired
	private UserRepostiory userRepostiory;

	@Autowired
	private LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {

		Location location=new Location();
		location.setPlace("Pune");
		location.setDescription("pune is great");
		location.setLongitude(48.5);
		location.setLatitude(38.6);
		locationRepository.save(location);

		User user1=new User();
		user1.setFirstName("Ramesh");
		user1.setLastName("velan");
		user1.setEmail("ajay@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepostiory.save(user1);


		User user2=new User();
		user2.setFirstName("Rameshan");
		user2.setLastName("velankutan");
		user2.setEmail("ajayan@gmail.com");
		user2.setPassword("secreted");
		user2.setLocation(location);
		userRepostiory.save(user2);
	}
}
