package com.freestack.spring.controllers;

import com.freestack.spring.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

	@PostMapping
	public User register(@RequestBody User user) {
		user.setId(1234L);
		return user;
	}
}
