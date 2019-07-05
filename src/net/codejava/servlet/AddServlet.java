package net.codejava.servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AddServlet extends HttpServlet{
	
	protected void doGet( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<div style='text-align: center'>");
		out.print("<h1>Add New Book</h1>");
		out.print("<form action='saveServlet' method='post'>");
		out.print("<table style='margin: auto;'>");
		out.print("<tr><td></td><td><input type='hidden' name='id'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name' size='35' style='padding: 6px'/></td></tr>");
		out.print("<tr><td>Author:</td><td><input type='text' name='author' size='35' style='padding: 6px'/></td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Save Book' style='padding: 8px'/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.println("<a href='view'>View Books</a>");
		out.print("</div>");
		out.close();
		
	}
}
