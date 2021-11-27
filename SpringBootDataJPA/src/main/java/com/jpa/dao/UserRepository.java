package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
	@Query(value="from User where city=:p")
	public List<User> findAll(@Param("p") String p);
}
