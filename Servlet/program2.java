package com.ust.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class program2
 */
@WebServlet("/program2")
public class program2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<head>");
	out.println("<title>Request Informatiom Example</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h3>Request Information Example</h3>");
	out.println("Method: "+ request.getMethod());
	out.println("<br/>Request URI:" + request.getRequestURI());
	out.println("<br/>Protocol: "+ request.getProtocol());
	out.println("<br/>PathInfo:"+ request.getPathInfo());
	out.println("<br/>Remote Address:" + request.getRemoteAddr());
	out.println("</body>");
	out.println("</html>");
	
		}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	}
