package com.yunus.login;

import de.invesdwin.instrument.DynamicInstrumentationLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		DynamicInstrumentationLoader.waitForInitialized(); //dynamically attach java agent to jvm if not already present
		DynamicInstrumentationLoader.initLoadTimeWeavingContext(); //weave all classes before they are loaded as beans
		SpringApplication.run(LoginApplication.class, args);
	}
}
