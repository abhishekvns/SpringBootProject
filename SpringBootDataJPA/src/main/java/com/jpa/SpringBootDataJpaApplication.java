package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;

@SpringBootApplication
public class SpringBootDataJpaApplication {
	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(SpringBootDataJpaApplication.class, args);
	UserRepository userRepository=applicationContext.getBean(UserRepository.class);
	
	User user1=new User(1, "Abhishek", "Delhi", "active");
	
	//User user=userRepository.save(user1);
	
	//System.out.println(user);
	
	Optional<User> user3=userRepository.findById(1);
	
	//System.out.println(user3.get());
	
	List<User> ls=(List<User>) userRepository.findAll("Delhi");
	ls.forEach(System.out::println);
	}

}
