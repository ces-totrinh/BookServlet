package net.codejava.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
	private static final AtomicInteger _COUNT = new AtomicInteger(0); 
	private int _id;
	private String _name, _author;
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	public String getAuthor() {
		return _author;
	}
	public void setAuthor(String author) {
		this._author = author;
	}
	
	public Book(String name,String author){
		this._id = _COUNT.incrementAndGet();
		this._name = name;
		this._author = author;
		
	}
	
}
