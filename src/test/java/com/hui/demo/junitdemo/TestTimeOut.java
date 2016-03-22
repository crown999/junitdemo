package com.hui.demo.junitdemo;

import org.junit.Test;

public class TestTimeOut {
	@Test(timeout=10000)
	public void testWithTimeout() {
	  while(true) {}
	}
}
