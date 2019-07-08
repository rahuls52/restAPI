package com.example.demo.myservice;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Post;

public interface Myservice {

	 

	public List<Post> getPost();

	public Optional<Post> getPostbyId(int id);

	public long getCount();

	public Post addNewPost(Post newpost);
	
    public Post updatePost(Post postname);
	
	public void deletePostById(int id);
	
	public void deletePost();

	public void deletAllPost();

	}
