package com.example.demo.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Post 
{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String postName;
	private int rent;
	private String amenities;
	private String facilitate;
	
	private float postDate;
	
	
	
	public Post() {
		// TODO Auto-generated constructor stub
	}
	public Post(int id, String postName, int rent, String amenities, String facilitate, float postDate) {
		super();
		this.id = id;
		this.postName = postName;
		this.rent = rent;
		this.amenities = amenities;
		this.facilitate = facilitate;
		this.postDate = postDate;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	
	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}


	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	
	public String getFacilitate() {
		return facilitate;
	}

	public void setFacilitate(String facilitate) {
		this.facilitate = facilitate;
	}


	public float getPostDate() {
		return postDate;
	}

	public void setPostDate(float postDate) {
		this.postDate = postDate;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", postName=" + postName + ", rent=" + rent + ", amenities=" + amenities
				+ ", facilitate=" + facilitate + ", postDate=" + postDate + "]";
	}
	
}
