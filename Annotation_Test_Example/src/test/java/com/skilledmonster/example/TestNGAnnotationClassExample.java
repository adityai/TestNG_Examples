package com.skilledmonster.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @Test annotation at class level
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
@Test
public class TestNGAnnotationClassExample {

	public CalculatorService service;

	@BeforeClass
	public void init() {
		System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
		System.out.println("init service");
		service = new SimpleCalculator();
	}

	public void testSum() {
		System.out.println("@Test : testSum()");
		int result = service.sum(10, 5);
		Assert.assertEquals(result, 15);
	}

	public void testDiv() {
		System.out.println("@Test : testDiv()");
		int result = service.div(10, 5);
		Assert.assertEquals(result, 2);
	}

	public void testMultiply() {
		System.out.println("@Test : testMultiply()");
		int result = service.multiply(10, 5);
		Assert.assertEquals(result, 50);
	}

	public void testSub() {
		System.out.println("@Test : testSub()");
		int result = service.sub(10, 5);
		Assert.assertEquals(result, 5);
	}

}