package com.freestack.spring.feature1.controllers;

import com.freestack.spring.EntityManagerFactorySingleton;
import com.freestack.spring.feature1.models.Video;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/testWithDB")
public class SimpleControllerWithDB {

	@GetMapping
	public Video test() {
		EntityManager entityManager = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Video aVeryBigMovie1 = new Video();
		aVeryBigMovie1.setTitle("A first very big movie");
		aVeryBigMovie1.setDescription("A very big movie for big smart people");

		entityManager.getTransaction().begin();
		entityManager.persist(aVeryBigMovie1);
		entityManager.getTransaction().commit();

		return aVeryBigMovie1;
	}
}
