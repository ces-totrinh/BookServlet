package net.codejava.servlet;

import javax.servlet.http.*;

import net.codejava.model.Book;
import net.codejava.model.MemoryDB;

import javax.servlet.*;
import java.io.*;

public class EditServlet2 extends HttpServlet{
	
	protected void doPost( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String n = req.getParameter("name");
		String au = req.getParameter("author");
		
		String sid=req.getParameter("id");
		int id =Integer.parseInt(sid);
		
		Book book = MemoryDB.Books.stream().filter(b -> b.getId() == id).findAny().orElse(null);		
		int index = MemoryDB.Books.indexOf(book);
		
		MemoryDB.Books.set(index, new Book(n, au));
		
		res.sendRedirect("view");
	    out.close();
		
	}
}
