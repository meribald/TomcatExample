package net.tomcat.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Scopes;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyServletContextListener extends GuiceServletContextListener {

	class MyServletModule extends ServletModule {
		@Override
		protected void configureServlets() {
			bind(WelcomeTexter.class);
			bind(HelloWorldServlet.class).in(Scopes.SINGLETON);
			serve("/hello").with(HelloWorldServlet.class);
		}
	}

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new MyServletModule());
	}

}
