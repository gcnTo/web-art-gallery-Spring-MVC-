package com.gcnto.artgallery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "text")
	private String text;
	
	public Review() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", text=" + text + "]";
	}

}
