package com.freestack.spring.controllers;

import com.freestack.spring.EntityManagerFactorySingleton;
import com.freestack.spring.models.User;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/users")
public class UserController {

	@PostMapping
	public User register(@RequestBody User user) {
		EntityManager entityManager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		return user;
	}
}
