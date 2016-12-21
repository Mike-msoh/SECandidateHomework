package com.ibm.homework.SECandidateHomework;

/*
 * Author : Myoung Suk, Oh
 * Dep : IBM KLAB
 * Date : 2016.12.17
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListElement {

	public static Integer get5thFromEnd(LinkedList<Integer> list) {
		if(list == null){
			throw new IllegalArgumentException("The input Liknked List is null.");			
		}
		
		// Create 2 Nodes to calculate the node in 5 nodes ahead.
		int count = 0;
		Iterator<Integer> originNode = list.iterator();
		Iterator<Integer> targetNode = list.iterator();

		while (originNode.hasNext()) {
			count++;
			originNode.next();
			if (count > 5) {
				targetNode.next();
			}
		}
		
		// Check the argument is valid.
		if(count < 5){
			throw new IllegalArgumentException("The Liknked List is too short to get 5th Elelment.");
		}

		return targetNode.next();
	}
}
