package com.Blog_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Blog_Project.entity.Commant_entity;
@Repository
public interface Commant_Repository extends JpaRepository<Commant_entity, Long> {

}
