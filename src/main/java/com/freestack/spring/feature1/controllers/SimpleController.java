package com.freestack.spring.feature1.controllers;

import com.freestack.spring.feature1.models.Video;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SimpleController {

	@GetMapping
	public Video test() {
		Video video = new Video();
		video.setTitle("titre de test");
		video.setDescription("description de test");
		return video;
	}
}
