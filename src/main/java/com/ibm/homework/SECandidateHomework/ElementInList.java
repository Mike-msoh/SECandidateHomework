package com.ibm.homework.SECandidateHomework;

/*
 * Author : Myoung Suk, Oh
 * Dep : IBM KLAB
 * Date : 2016.12.17
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementInList {

	public static boolean isContainAllElement(List<Integer> firstList, List<Integer> secondList) {

		if (firstList == null || secondList == null || firstList.size() == 0 || secondList.size() == 0) {
			throw new IllegalArgumentException("The input list is invalid.");
		}

		// Create 2 lists to compare an element in small list to that of larger list.
		List<Integer> innerList;
		List<Integer> outterList;

		if (firstList.size() >= secondList.size()) {
			innerList = secondList;
			outterList = firstList;
		} else {
			innerList = firstList;
			outterList = secondList;
		}

		// Use a hashset if it contains the element. 
		Set<Integer> hashSet = new HashSet<Integer>(outterList);

		for (Integer element : innerList) {
			if (element == null) {
				throw new IllegalArgumentException("The element in list is invalid.");
			}
			if (!hashSet.contains(element)) {
				return false;
			}
		}
		return true;
	}

}
