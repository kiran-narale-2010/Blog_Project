package com.Blog_Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Commant_entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String msg ;
	private String author_name;
	
	@ManyToOne
	private Post_entity post_entity;
	


	public Commant_entity() {
	}
	
	public Commant_entity(Long id, String msg, String author_name, Post_entity post_entity) {
		super();
		this.id = id;
		this.msg = msg;
		this.author_name = author_name;
		this.post_entity = post_entity;
	}






	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	

	public Post_entity getPost_entity() {
		return post_entity;
	}


	public void setPost_entity(Post_entity post_entity) {
		this.post_entity = post_entity;
	}

	
}
