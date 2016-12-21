package com.ibm.homework.SECandidateHomework;

/*
 * Author : Myoung Suk, Oh
 * Dep : IBM KLAB
 * Date : 2016.12.17
 */

public enum TriangleType {

	/*
	 * Define the types of all triangles.
	 */
	ISOSCELES("Isosceles"), EQUILATERAL("Equilateral"), SCALENE("Scalene"), INVALID("Invalid");

	private String type;

	TriangleType(String type) {
		this.type = type;
	}

}
