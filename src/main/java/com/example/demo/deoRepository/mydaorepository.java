package com.example.demo.deoRepository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Post; 

@Repository
public interface mydaorepository extends JpaRepository<Post, Integer>
{

}
