package com.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.sp.dbcon.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		
		String myName =req.getParameter("name1");
		String myEmail =req.getParameter("email1");

		String myPass =req.getParameter("pass1");

		String myCity =req.getParameter("city1");

		try {
			
			Connection con = DbConnection.getConnection();
			
			
			String insert_sql_query ="INSERT INTO register VALUES(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(insert_sql_query);
			
			ps.setString(1, myName); 
			ps.setString(2, myEmail); 
			ps.setString(3, myPass); 
			ps.setString(4, myCity);
			
			int count = ps.executeUpdate();
			if(count> 0) {
				out.println("<h3 style='color:green'> Registered Succesfully </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}else {
				out.println("<h3 syle='color:red'> Registered Unsuccesfully </h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/Register.html");
				rd.include(req, resp);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	

}
