package com.abc.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.dao.login;
public class loginservlet extends HttpServlet
{
	  private static final long serialVersionUID = 1L;

	   public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException 
	   {  

	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	        String n=request.getParameter("userid");  
	        String p=request.getParameter("userpass"); 
	        
	        
	        
	        HttpSession session = request.getSession(false);
	        if(session!=null)
	        session.setAttribute("name", n);
	        if(login.validate(n,p))
	        {  
	            RequestDispatcher rd=request.getRequestDispatcher("/Login/welcome.jsp");  
	            rd.forward(request,response);  
	        }  
	        else
	        {  
	            out.print("<p style=\"color:red\">Sorry userid or password error</p>");  
	            //RequestDispatcher rd=request.getRequestDispatcher("Login/Index.jsp");  
	            //rd.include(request,response);  
	        }

	        out.close();  
	    }  
	} 


