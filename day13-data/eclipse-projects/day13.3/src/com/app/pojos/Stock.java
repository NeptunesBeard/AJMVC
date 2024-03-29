package com.app.pojos;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="stocks")
public class Stock {
	private Integer id;
	private String name,company;
	private Date publishDate;
	private int quantity;
	private double price;
	public Stock() {
		System.out.println("in cnstr of "+getClass().getName());
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length=20,unique=true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=20)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="pub_date")
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Column(columnDefinition="double(8,1)")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", company=" + company + ", publishDate=" + publishDate
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
