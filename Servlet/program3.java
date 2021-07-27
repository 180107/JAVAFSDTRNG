package com.ust.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class program3
 */
@WebServlet("/program3")
public class program3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
			{
       
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   Enumeration e = request.getHeaderNames();
   while(e.hasMoreElements()) {
	   String name = (String)e.nextElement();
	   String value= request.getHeader(name);
	   out.println(name + "=" + value );
   }
}

}
