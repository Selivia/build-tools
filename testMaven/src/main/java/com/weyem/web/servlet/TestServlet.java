package com.weyem.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 32146112136415864L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		System.out.println("hh");
		System.out.println("ha");
		request.getRequestDispatcher("/jsp/test.jsp").forward(request, response);
	}
}
