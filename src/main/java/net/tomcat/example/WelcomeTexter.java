package net.tomcat.example;

import javax.inject.Named;

import com.google.inject.servlet.RequestScoped;

@Named
@RequestScoped
public class WelcomeTexter {

	public String getGreeting() {
		return "hello, world";
	}
}
