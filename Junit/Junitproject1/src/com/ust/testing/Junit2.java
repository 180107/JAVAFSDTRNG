package com.ust.testing;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class Junit2 {
	@Test
  public void calc() {
		int a=5 , b=3, c=4;
		
		assertNotEquals(a, b+c);
	}
}
