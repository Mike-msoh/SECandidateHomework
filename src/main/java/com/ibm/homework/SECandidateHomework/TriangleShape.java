package com.ibm.homework.SECandidateHomework;

/*
 * Author : Myoung Suk, Oh
 * Dep : IBM KLAB
 * Date : 2016.12.17
 */

public class TriangleShape {

	public static TriangleType getTriangleType(int sideA, int sideB, int sideC) {

		/*
		 * Check the arguments if the sides are valid for a triangle.
		 */
		if (checkValidTriangle(sideA, sideB, sideC)) {
			throw new IllegalArgumentException("This triangle is not valid.");
		} else if (checkInvalidLength(sideA, sideB, sideC)) {
			throw new IllegalArgumentException("The length of sides should be bigger than 0");
		}

		/*
		 * Classify the type of triangle. 
		 */
		if (sideA == sideB && sideB == sideC) {
			return TriangleType.EQUILATERAL;
		} else if (sideA == sideB || sideB == sideC || sideA == sideC) {
			return TriangleType.ISOSCELES;
		} else {
			return TriangleType.SCALENE;
		}
	}

	/*
	 * Check for a valid triangle. One side of triangle can not bigger than the sum of 2 sides.  
	 */
	private static boolean checkValidTriangle(int sideA, int sideB, int sideC) {
		return sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB;
	}

	/*
	 * The all sides of triangle should be bigger than 0. (not 0 allowed)
	 */
	private static boolean checkInvalidLength(int sideA, int sideB, int sideC) {
		return sideA <= 0 || sideB <= 0 || sideC <= 0;
	}

}
