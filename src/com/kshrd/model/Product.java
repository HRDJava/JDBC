package com.kshrd.model;

public class Product {

	private int id;
	private String name;
	private int qty;
	private float price;
	private float total;
	public Product(){}
	public Product(int id, String name, int qty, float price, float total) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.total = total;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
