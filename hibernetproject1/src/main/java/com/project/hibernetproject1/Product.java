package com.project.hibernetproject1;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Entity class file
@Table(name="Product_Info")
@Entity(name="product_details")
public class Product {
	@Id        //setting primary key
	private int pid;
	private String pname;
	private int pprice;
	//constructors
	public Product(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
}
