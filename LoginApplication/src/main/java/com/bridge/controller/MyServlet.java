package com.bridge.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridge.dao.Dao;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 System.out.println("this is servlet");
		 res.setContentType("text/html");
		 
		 RequestDispatcher rt = req.getRequestDispatcher("display.jsp");
		 req.setAttribute("name", req.getParameter("name"));
		 rt.include(req, res);
		 
		 
         int id=Integer.parseInt(req.getParameter("id").trim());
         String name=req.getParameter("name").trim();
         int salary=Integer.parseInt(req.getParameter("salary").trim());
          
         Dao dao=new Dao(); 
         boolean b=dao.saveDetails(id, name, salary);
         res.setContentType("text/html");
         PrintWriter out=res.getWriter();
        if(b==true)
        {
          out.println("<h1>Employee details sucessfully saved.</h1>");
           
        }
         
        else
        {
            out.println("<h1>Employee details already existed.</h1>"); 
        }
        out.println("");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
