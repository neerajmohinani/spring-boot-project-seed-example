package com.test.project.model;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	/**
	 * This method will find an User instance in the database by its email. Note
	 * that this method is not implemented and its working code will be
	 * automatically generated from its signature by Spring Data JPA.
	 */
	public List<User> findByEmail(String email);

}