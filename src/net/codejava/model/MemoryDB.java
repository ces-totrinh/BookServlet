package net.codejava.model;

import java.io.*;
import java.util.*;;

public class MemoryDB {
	public static final List<Book> BOOKS =  new ArrayList<Book>() {
		{
	        add(new Book("The Great Gatsby", "F Scott Fitzgerald"));
	        add(new Book("Moving On, Moving Forward", "Venkaiah Naidu"));
	        add(new Book("We are Displaced", "Malala Yousafzai"));
	        add(new Book("I Do What I Do", "Raghuram Rajan"));
		}
	};
}
	