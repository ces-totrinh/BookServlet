package net.codejava.servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import net.codejava.model.*;

public class ViewServlet extends HttpServlet{
	
	protected void doGet( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<a href='addNew'>Add New Book</a>");
		out.println("<h1>Books List</h1>");
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Name</th><th>Author</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Book book : MemoryDB.BOOKS){
			out.print(
				"<tr>"
					+ "<td>"+book.getName()+"</td>"
					+ "<td>"+book.getAuthor()+"</td>"
					+ "<td style='text-align: center'>"
						+ "<a href='edit?id="+book.getId()+"'>edit</a>"
					+ "</td><td style='text-align: center'>"
						+ "<a href='deleteServlet?id="+book.getId()+"'>delete</a>"
					+ "</td>"
				+ "</tr>");
		}	
		
		out.print("</table>");
		
		out.close();
		
	}

}