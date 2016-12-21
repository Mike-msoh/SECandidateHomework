package com.ibm.homework.SECandidateHomework;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ElementInListTest {

	@Test
	public void testEqualList() {
		List<Integer> firstList = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> secondList = Arrays.asList(2, 4, 6, 8, 10);

		assertEquals(true, ElementInList.isContainAllElement(firstList, secondList));
	}
	
	@Test
	public void testListWithLongerSecondList() {
		List<Integer> firstList = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> secondList = Arrays.asList(8, 4, 6, 2, 10, 12, 24, 56);

		assertEquals(true, ElementInList.isContainAllElement(firstList, secondList));
	}

	@Test
	public void testListWithShorterSecondList() {
		List<Integer> firstList = Arrays.asList(2, 4, 6, 8, 10, 12, 34, 24, 33);
		List<Integer> secondList = Arrays.asList(2, 4, 8, 6, 10);

		assertEquals(true, ElementInList.isContainAllElement(firstList, secondList));
	}

	@Test
	public void testElementsNotInList() {
		List<Integer> firstList = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> secondList = Arrays.asList(5, 4, 2, 8, 10);

		assertEquals(false, ElementInList.isContainAllElement(firstList, secondList));
 	}
	
	@Test
	public void testElementsNotInLongerFirstList() {
		List<Integer> firstList = Arrays.asList(2, 4, 6, 8, 10, 12);
		List<Integer> secondList = Arrays.asList(2, 33, 45, 4, 5, 8, 10);

		assertEquals(false, ElementInList.isContainAllElement(firstList, secondList));
 	}
	
	@Test
	public void testElementsNotInLongerSecondList() {
		List<Integer> firstList = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> secondList = Arrays.asList(24, 45, 2, 4, 5, 8, 10, 12);

		assertEquals(false, ElementInList.isContainAllElement(firstList, secondList));
 	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testListWithNull() {
		List<Integer> secondList = Arrays.asList(2, 4, 5, 8, 10, 12);
		ElementInList.isContainAllElement(null, secondList);
 	}

	@Test(expected = IllegalArgumentException.class)
	public void testListWithSize0() {
		List<Integer> firstList = Arrays.asList();
		List<Integer> secondList = Arrays.asList(2, 4, 5, 8, 10, 12);
		ElementInList.isContainAllElement(firstList, secondList);
 	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testListWithNullElement() {
		List<Integer> firstList = Arrays.asList(2, 4, 5, null, 10);
		List<Integer> secondList = Arrays.asList(2, 4, 5, 8, 10, 12);
		ElementInList.isContainAllElement(firstList, secondList);
 	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithNullLists() {
		ElementInList.isContainAllElement(null, null);
 	}
}
