package com.project.hibernetproject1;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//entity class file
@Table(name="Customer_Info")
@Entity(name="Customer_Details")
public class Customer {
	@Id        //setting primary key
	private int id;
	private String name;
	
	@OneToOne           //OneToOne mapping between product and customer 
	@JoinColumn(name="prod_id")
	private Product prod;

	//constructors
	public Customer(int id, String name, Product prod) {
		super();
		this.id = id;
		this.name = name;
		this.prod = prod;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter and setter
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

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
}
