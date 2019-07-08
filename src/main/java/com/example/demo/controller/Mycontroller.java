package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.myservice.Myservice;

@RestController
public class Mycontroller {

	@Autowired
	Myservice service;

	@PostMapping("post/All")
	public List<Post> getPost() {
		System.out.println(this.getClass().getSimpleName() + "-Post All post_Status Services");
		return service.getPost();
	}

	@PostMapping("post/{id}")
	public Post getPostById(@PathVariable int id) throws Exception {

		System.out.println(this.getClass().getSimpleName() + "-Post Details by id");

		Optional<Post> post = service.getPostbyId(id);

		if (!post.isPresent())

			throw new Exception("Could Not Find Any Post -" + id);

		return post.get();
	}

	@GetMapping("post/count")
	public long getCount() {
		return service.getCount();
	}

	 @PostMapping("/post/add")
	//@RequestMapping(value = "/post/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Post createPost(@RequestBody Post newpost) {
		System.out.println(this.getClass().getSimpleName() + "-Create a New Entry in Table .");

		return service.addNewPost(newpost);
	}

	@PutMapping("post/update/{id}")
	public Post updatePost(@RequestBody Post update, @PathVariable int id) {

		update.setPostName(update.getPostName());
		update.setRent(update.getRent());
		update.setAmenities(update.getAmenities());
		update.setId(id);
		Post p1 = service.updatePost(update);
		return p1;
	}

	@DeleteMapping("post/by{id}")
	public void deleteById(@PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + "Delete Post By ID .");

		Optional<Post> np = service.getPostbyId(id);

		if (!np.isPresent())
			throw new Exception("Could Not Found any Post" + id);

		service.deletePostById(id);
	}

	@DeleteMapping("post/delete")
	public void deletAllPost() {
		service.deletAllPost();
	}

	@DeleteMapping("post/del")
	public void deletePost() {
		service.deletAllPost();
	}

}