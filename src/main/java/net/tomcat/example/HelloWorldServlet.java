package net.tomcat.example;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;

public class HelloWorldServlet extends HttpServlet {

	@Inject
	WelcomeTexter welcomeTexter;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.getWriter().println(welcomeTexter.getGreeting());
	}
}
