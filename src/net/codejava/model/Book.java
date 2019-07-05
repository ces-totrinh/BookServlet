package net.codejava.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int id;
	private String name, author;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book(String name,String author){
		this.id = count.incrementAndGet();
		this.name = name;
		this.author = author;
		
	}
	
}
