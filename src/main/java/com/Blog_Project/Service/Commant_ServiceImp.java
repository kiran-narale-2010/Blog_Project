package com.Blog_Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog_Project.Repository.Commant_Repository;
import com.Blog_Project.entity.Commant_entity;
@Service
public class Commant_ServiceImp implements Commant_Service  {

	@Autowired
	private Commant_Repository commant_repo;
	@Override
	public Commant_entity add_commant_data(Commant_entity commant_entity1) {
		return commant_repo.save(commant_entity1);
	}

}
