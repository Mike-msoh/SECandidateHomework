package com.ibm.homework.SECandidateHomework;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleShapeTest {
	
	@Test
	public void testTriangleType() {
		assertEquals(TriangleType.ISOSCELES, TriangleShape.getTriangleType(7, 8, 8));
		assertEquals(TriangleType.EQUILATERAL, TriangleShape.getTriangleType(3, 3, 3));
		assertEquals(TriangleType.SCALENE, TriangleShape.getTriangleType(3, 4, 5));
		assertEquals(TriangleType.ISOSCELES, TriangleShape.getTriangleType(8, 8, 3));
		assertEquals(TriangleType.ISOSCELES, TriangleShape.getTriangleType(8, 5, 8));
		assertEquals(TriangleType.SCALENE, TriangleShape.getTriangleType(8, 7, 6));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithMinusLength1() {
		TriangleShape.getTriangleType(-8, -8, -8);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithMinusLength2() {
		TriangleShape.getTriangleType(2, -11, 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWithInvalidLength() {
		TriangleShape.getTriangleType(2, 1, 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWith0Value() {
		TriangleShape.getTriangleType(1, 0, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithInvalidSideLength() {
		TriangleShape.getTriangleType(16, 2, 11);
	}
}
