package com.jsm.cursoudemy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jsm.cursoudemy.entities.User;
import com.jsm.cursoudemy.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888", "12345");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
