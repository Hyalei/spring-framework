package com.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
		Object car = ioc.getBean("car");
		System.out.println(car);
	}
}