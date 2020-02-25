package com.test;

import org.testng.annotations.Test;

public class dependsonAnnotation {

	
	@Test(priority=2)
	public void aa() {
		System.out.println("HI there---aa ");
	}
	@Test(dependsOnMethods="cc",invocationCount=12,priority=1)
	public void bb() {
		System.out.println("HI there----bb ");
	}
	@Test(priority=3)
	public void cc() {
		System.out.println("HI there----cc ");
	//int i =9/0;
	}
	@Test(priority=4)
	public void dd() {
		System.out.println("HI there----dd ");
	}
	@Test(priority=5)
	public void ee() {
		System.out.println("HI there---ee ");
	}
}
