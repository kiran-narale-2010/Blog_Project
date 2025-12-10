package com.Blog_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Blog_Project.Service.Commant_Service;
import com.Blog_Project.entity.Commant_entity;

@RestController
public class Commant_Controller {

	@Autowired
	private Commant_Service commant_serviceimp;
	
	@PostMapping("/Add/commants")
	public Commant_entity commant_data(@RequestBody Commant_entity commant_entity) {
		return commant_serviceimp.add_commant_data(commant_entity);
	}
	
}
