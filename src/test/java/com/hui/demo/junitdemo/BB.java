package com.hui.demo.junitdemo;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({ SlowTests.class, FastTests.class })
public class BB {
	@Test
	public void c() {

	}
}