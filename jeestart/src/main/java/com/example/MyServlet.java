package com.example;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/my-servlet")
public class MyServlet extends HttpServlet {

	@Inject
	MyService myService;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println(myService.getGreeting(name));

		resp.setCharacterEncoding("UTF-8");
		resp.addHeader("Content-Type", "text/html; charset=UTF-8");
		resp.getWriter().println(myService.getGreeting(name));
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Przyszedł GET");

		resp.setStatus(202);

		resp.getWriter().println("<h1>Hello World</h1>Hello " + myService.getHello());
		resp.getWriter().flush();
		resp.getWriter().close();
	}
}
