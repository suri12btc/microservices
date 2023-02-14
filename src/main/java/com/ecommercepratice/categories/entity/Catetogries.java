package com.ecommercepratice.categories.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class Catetogries {
	@Id
	
	@Column(name="cat_id")
	private int cat_id;
	@Column(name="cat_name")
	private String cat_name;
	@Column(name="cat_img_path")
	private String cat_img_path;
	@Column(name="cat_created_date")
	private String cat_created_date;
	@Column(name="cat_updated_date")
	private String cat_updated_date;
	@Column(name="cat_last_updated")
	private int cat_last_updated;
	public int getCat_id() {
		return cat_id;
	}
	
	
	public Catetogries() {
		super();
	}


	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getCat_img_path() {
		return cat_img_path;
	}
	public void setCat_img_path(String cat_img_path) {
		this.cat_img_path = cat_img_path;
	}
	public String getCat_created_date() {
		return cat_created_date;
	}
	public void setCat_created_date(String cat_created_date) {
		this.cat_created_date = cat_created_date;
	}
	public String getCat_updated_date() {
		return cat_updated_date;
	}
	public void setCat_updated_date(String cat_updated_date) {
		this.cat_updated_date = cat_updated_date;
	}
	public int getCat_last_updated() {
		return cat_last_updated;
	}
	public void setCat_last_updated(int cat_last_updated) {
		this.cat_last_updated = cat_last_updated;
	}
	public Catetogries(int cat_id, String cat_name, String cat_img_path, String cat_created_date,
			String cat_updated_date, int cat_last_updated) {
		super();
		this.cat_id = cat_id;
		this.cat_name = cat_name;
		this.cat_img_path = cat_img_path;
		this.cat_created_date = cat_created_date;
		this.cat_updated_date = cat_updated_date;
		this.cat_last_updated = cat_last_updated;
	}

	

}
