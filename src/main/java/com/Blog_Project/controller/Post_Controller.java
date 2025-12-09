package com.Blog_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Blog_Project.Service.Post_ServiceImp;
import com.Blog_Project.entity.Post_entity;

@RestController
public class Post_Controller {

	@Autowired
	private Post_ServiceImp post_serviceimp;
	
	@PostMapping("/Data/add")
	public Post_entity SetValuesDetails(@RequestBody Post_entity post_entity) {
		return post_serviceimp.addValues(post_entity);
	}
	
}
