package net.codejava.servlet;

import javax.servlet.http.*;

import net.codejava.model.Book;
import net.codejava.model.MemoryDB;

import javax.servlet.*;
import java.io.*;
import java.util.Collections;
import java.util.List;

public class SaveServlet extends HttpServlet{
	
	protected void doPost( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String n = req.getParameter("name");
		String au = req.getParameter("author");
		
		MemoryDB.Books.add(new Book(n, au));
		
		res.sendRedirect("view");
	    out.close();
		
	}
}
