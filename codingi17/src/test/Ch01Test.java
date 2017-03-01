package test;

import static org.junit.Assert.*;

import org.junit.Test;

import cci.arrays.lists.Ch01Ex01;

public class Ch01Test {

	@Test
	public void test() {
		Ch01Ex01 ex01 = new Ch01Ex01(); 
		assertTrue("No repeated chars", ex01.hasAllUniqueChars("abejo"));
		assertFalse("Repeated chars", ex01.hasAllUniqueChars("abajo"));
	}
}
