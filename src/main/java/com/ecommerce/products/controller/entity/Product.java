package com.ecommerce.products.controller.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="products")
public class Product {
	@Id
	@Column(name="p_id")
	private int p_id;
	@Column(name="p_name")
	private String p_name;
	@Column(name="p_desc")
	private String p_desc;
	@Column(name="p_price")
	private double p_price;
	@Column(name="p_offer_price")
	private double p_offer_price;
	@Column(name="cat_id")
	private int cat_id;
	@Column(name="p_created_date")
	private String p_created_date;
	@Column(name="p_updated_date")
	private String p_updated_date;
	@Column(name="p_last_updated")
	private int p_last_updated;
	@Column(name="p_total_products")
	private int p_total_products;
	@Column(name="p_ordered_products")
	private int p_ordered_products;
	@Column(name="p_img_path")
	private String p_img_path;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_desc() {
		return p_desc;
	}
	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public double getP_offer_price() {
		return p_offer_price;
	}
	public void setP_offer_price(double p_offer_price) {
		this.p_offer_price = p_offer_price;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getP_created_date() {
		return p_created_date;
	}
	public void setP_created_date(String p_created_date) {
		this.p_created_date = p_created_date;
	}
	public String getP_updated_date() {
		return p_updated_date;
	}
	public void setP_updated_date(String p_updated_date) {
		this.p_updated_date = p_updated_date;
	}
	public int getP_last_updated() {
		return p_last_updated;
	}
	public void setP_last_updated(int p_last_updated) {
		this.p_last_updated = p_last_updated;
	}
	public int getP_total_products() {
		return p_total_products;
	}
	public void setP_total_products(int p_total_products) {
		this.p_total_products = p_total_products;
	}
	public int getP_ordered_products() {
		return p_ordered_products;
	}
	public void setP_ordered_products(int p_ordered_products) {
		this.p_ordered_products = p_ordered_products;
	}
	public String getP_img_path() {
		return p_img_path;
	}
	public void setP_img_path(String p_img_path) {
		this.p_img_path = p_img_path;
	}
	public Product(int p_id, String p_name, String p_desc, double p_price, double p_offer_price, int cat_id,
			String p_created_date, String p_updated_date, int p_last_updated, int p_total_products,
			int p_ordered_products, String p_img_path) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.p_price = p_price;
		this.p_offer_price = p_offer_price;
		this.cat_id = cat_id;
		this.p_created_date = p_created_date;
		this.p_updated_date = p_updated_date;
		this.p_last_updated = p_last_updated;
		this.p_total_products = p_total_products;
		this.p_ordered_products = p_ordered_products;
		this.p_img_path = p_img_path;
	}
	public Product() {
		super();
	}
	
	

}
