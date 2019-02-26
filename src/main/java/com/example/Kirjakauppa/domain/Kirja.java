package com.example.Kirjakauppa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;


@Entity
public class Kirja {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title, author, year, isbn, price;
	
	public Kirja() {
			
	}

	public Kirja(String title, String author, String year, String isbn, String price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Kirja [author=" + author + ", title=" + title
				+ ", year=" + year + ", isbn=" +isbn+", price=" + price + "]";
	
	
}
	
}
