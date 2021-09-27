package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ProductS")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name, String email, String location) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.location = location;
} 
	public void demo(){
		System.out.println("Success");
	}
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String email;
    private String location;
}
