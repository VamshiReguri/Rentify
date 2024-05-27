package com.rentify.model; 
import javax.persistence.*; 
@Entity 
public class Property { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id; 
private String place; 
private int area; 
private int bedrooms; 
private int bathrooms; 
private String nearby; 
@ManyToOne 
@JoinColumn(name = "owner_id") 
private User owner;  
}