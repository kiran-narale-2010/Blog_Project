package com.Blog_Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog_Project.Repository.Post_Repository;
import com.Blog_Project.entity.Post_entity;
@Service
public class Post_ServiceImp implements Post_Service {

	@Autowired
	private Post_Repository post_repo;
	@Override
	public Post_entity addValues(Post_entity post_entity1) {
		return post_repo.save(post_entity1);
	}

}
