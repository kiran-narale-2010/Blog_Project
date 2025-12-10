package com.Blog_Project.entity;
import java.time.LocalDateTime;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Post_entity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@jakarta.persistence.Id
	private Long id;
	private String title;
	private String content;
	private String imageurl;
	private Long likecount;
    private LocalDateTime createdAt;
    
    @OneToMany
    private List<Commant_entity> commant_entity;
    

	public Post_entity(Long id, String title, String content, String imageurl, Long likecount, LocalDateTime createdAt,
			List<Commant_entity> commant_entity) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.imageurl = imageurl;
		this.likecount = likecount;
		this.createdAt = createdAt;
		this.commant_entity = commant_entity;
	}


	public Post_entity() {
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public String getContent() {
		return content;
	}





	public void setContent(String content) {
		this.content = content;
	}





	public String getImageurl() {
		return imageurl;
	}





	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}





	public Long getLikecount() {
		return likecount;
	}





	public void setLikecount(Long likecount) {
		this.likecount = likecount;
	}





	public LocalDateTime getCreatedAt() {
		return createdAt;
	}





	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	
	public List<Commant_entity> getCommant_entity() {
		return commant_entity;
	}


	public void setCommant_entity(List<Commant_entity> commant_entity) {
		this.commant_entity = commant_entity;
	}


}
