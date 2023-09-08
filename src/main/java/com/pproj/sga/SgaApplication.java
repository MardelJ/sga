package com.pproj.sga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SgaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgaApplication.class, args);
		helloSpring("Hello World");
		System.out.println("Hello Spring");
	}

	public static String helloSpring (String msg) {
		System.out.println("Hello World" + msg);
		return msg;
	}
}
