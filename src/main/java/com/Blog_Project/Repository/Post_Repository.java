package com.Blog_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Blog_Project.entity.Post_entity;
@Repository
public interface Post_Repository extends JpaRepository<Post_entity, Long> {

}
