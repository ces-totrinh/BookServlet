package net.codejava.servlet;

import javax.servlet.http.*;

import net.codejava.model.MemoryDB;

import javax.servlet.*;
import java.io.*;

public class DeleteServlet extends HttpServlet{
	@Override
	protected void doGet( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String sid=req.getParameter("id");
		int id =Integer.parseInt(sid);
		
		MemoryDB.BOOKS.removeIf(b -> (b.getId()== id)); 
		
		res.sendRedirect("view");
		
	}
}
