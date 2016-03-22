package com.hui.demo.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class B {
	@Test
	public void testB() {
		System.out.println("B running");
		assertEquals("B","B");
	}
}
