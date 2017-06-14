package com.abc.servlets;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.abc.dao.registration;

@MultipartConfig(maxFileSize = 10485760L)
public class registrationservlet extends HttpServlet
{
	  private static final long serialVersionUID = 1L;

	   public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException 
	   {  

	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	        String userid=request.getParameter("userid");  
	        String userpass=request.getParameter("userpass"); 
	        String fname=request.getParameter("fname"); 
	        String lname=request.getParameter("lname"); 
	        String uname=request.getParameter("uname");
	      
	        InputStream photo = null;
	        Part filePart = request.getPart("photo");
	        if (filePart != null)
	        {
	        	photo = filePart.getInputStream();
	        }
	        HttpSession session = request.getSession(false);
	        if(session!=null)
	        session.setAttribute("name", userid);
			if(userid.isEmpty()||userpass.isEmpty()||fname.isEmpty()||lname.isEmpty()||uname.isEmpty()||photo==null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Login/registration.jsp");
				out.println("<font color=red>Please fill all the fields</font>");
				rd.include(request, response);
			}
			else
			{
				if(registration.register(userid,userpass,fname,lname,uname,photo)>0)
				{
					RequestDispatcher rd = request.getRequestDispatcher("Login/welcome.jsp");
				    rd.forward(request, response);
				}
			}

	        out.close();  
	    }  
	   
	   public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException 
	   {doPost(request, response);}  
	} 


