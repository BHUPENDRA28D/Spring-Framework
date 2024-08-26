package com.sp.controllers;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sp.dbcon.DbConnection;
import com.sp.model.UserProfile;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		
		try {
			
			Connection conn = DbConnection.getConnection();
			
			String select_sql_query ="Select * from register where email =? and password=?";
			PreparedStatement ps = conn.prepareStatement(select_sql_query);
			
			ps.setString(1,myEmail); 
			ps.setString(2,myPass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				UserProfile user = new UserProfile();
				 user.setName(rs.getString("name"));
				 user.setEmail(rs.getString("email"));
				 user.setCity(rs.getString("city"));
				 
				 HttpSession session = req.getSession();
				 session.setAttribute("session_user",user);
				 
				 RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
					rd.include(req, resp);
				 
				
			}else
			{ out.println("<h3 style='color:red'> Login Unsuccesfully </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}