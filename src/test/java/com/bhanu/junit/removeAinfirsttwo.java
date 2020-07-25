package com.bhanu.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeAinfirsttwo {
	
	private RemoveA removeA;
	/*
	 * TODO list for my feature
	 * 
	 * 1. ABCD => BCD - success
	 * 2. AACD => CD	-success
	 * 3. BACD => BCD	-success
	 * 4. BBAAA => BBAAA - success
	 * 5. "" => ""	-success
	 * 6. A => ""	-success
	 */
	
	@BeforeEach
	void setUp()
	{
		removeA=new RemoveA();
	}

	@Test
	void test1() {
		
		assertEquals("BCD",removeA.remove("ABCD"));
		
	}
	@Test
	void test2() {
		
		assertEquals("CD",removeA.remove("AACD"));
		
	}
	@Test
	void test3() {
		
		assertEquals("BCD",removeA.remove("BACD"));
		
		
	}
	@Test
	void test4() {
		
		assertEquals("BBAAA",removeA.remove("BBAAA"));
		
	}
	@Test
	void test5() {
		
		assertEquals(" ",removeA.remove(""));
		
	}
	@Test
	void test6() {
		
		assertEquals(" ",removeA.remove("A"));
		
	}

}
