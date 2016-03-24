package com.hui.demo.junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testCheckAccount() {
		String username="grey";
		String password = "1989927";
		boolean flag = new App().checkAccount(username, password);
		assertTrue("It should be true",flag);
	}
	
	@Test
	public void testCheckAccount2() {
		String username="grey";
		String password = " ";
		boolean flag2 = new App().checkAccount(username, password);
		assertFalse("a" , flag2);
	}
}
