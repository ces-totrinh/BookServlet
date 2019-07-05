package net.codejava.servlet;

import javax.servlet.http.*;

import net.codejava.model.Book;
import net.codejava.model.MemoryDB;

import javax.servlet.*;
import java.io.*;

public class EditServlet extends HttpServlet{
	@Override
	protected void doGet( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String sid=req.getParameter("id");
		int id =Integer.parseInt(sid);
		
		Book book = MemoryDB.BOOKS.stream().filter(b -> b.getId() == id).findAny().orElse(null);
		out.print("<div style='text-align: center'>");
		out.print("<h1>Update Book</h1>");
		out.print("<form action='editServlet' method='post'>");
		out.print("<table style='margin: auto;'>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+book.getId()+"' size='35' style='padding: 6px'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+book.getName()+"' size='35' style='padding: 6px'/></td></tr>");
		out.print("<tr><td>Author:</td><td><input type='text' name='author' value='"+book.getAuthor()+"' size='35' style='padding: 6px'/></td></tr>");
		out.print("<tr><td colspan='4'><input type='submit' value='Save' style='padding: 8px'/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.println("<a href='view'>View Books</a>");
		out.print("</div>");
		
		out.close();
		
	}

}
