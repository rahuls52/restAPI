package com.example.demo.myservice;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deoRepository.mydaorepository;
import com.example.demo.model.Post;

@Service
public class Myserviceimp implements Myservice{
	
	@Autowired
	mydaorepository deorepo;
	
	@Override
	public List<Post> getPost(){
		
		return (List<Post>) deorepo.findAll();
	}
	@Override
	public Optional<Post> getPostbyId(int id)
	{
		return deorepo.findById(id);
	}
	@Override
	public long getCount()
	{
		return deorepo.count();
	}
	@Override
	public Post addNewPost(Post postname)
	{
		Post p1 = deorepo.save(new Post(postname.getId(),postname.getPostName(),postname.getRent(),postname.getAmenities(),postname.getFacilitate(),postname.getPostDate()));
		return p1;
	}
	@Override
	public Post updatePost(Post postname)
	{
		return deorepo.save(postname);
	}
	@Override
	public void deletePostById(int id)
	{
		  deorepo.deleteById(id);
	}
	@Override
	public void deletAllPost() {
		// TODO Auto-generated method stub
		deorepo.deleteAll();
	}
	@Override
	public void deletePost() {
		// TODO Auto-generated method stub
		deorepo.deleteAll();
	}

}
