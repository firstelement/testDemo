package com.sunmi.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.sunmi.base.testplay;

public class tetstplay {

	@Test
	public void erro() {
		assertTrue(new testplay().err());
	}
	@Test
	public void erro2() {
		assertTrue(new testplay().err2());
	}
}
