package conf;

import com.google.inject.AbstractModule;

import etc.GreetingService;
import etc.GreetingServiceImpl;

public class Configuration extends AbstractModule {

	protected void configure() {

		// /////////////////////////////////////////////////////////////////////
		// Some guice bindings
		// /////////////////////////////////////////////////////////////////////
		// some additional bindings for the application:
		bind(GreetingService.class).to(GreetingServiceImpl.class);

	}

}
