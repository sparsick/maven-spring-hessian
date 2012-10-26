package com.github.skosmalla.hello.world.spring.hessian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HessianClient {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"META-INF/spring/hessian-config.xml");

		HelloWorld service = (HelloWorld) appContext.getBean("helloWorldService");

		String welcomeMessage = service.welcome();

		System.out.println(welcomeMessage);

	}
}