package com.ibm.homework.SECandidateHomework;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class LinkedListElementTest {

	@Test
	public void test5thElementFromEndInList() {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4); // 5th element from last.
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);

		assertEquals(new Integer(4), LinkedListElement.get5thFromEnd(linkedList));
	}

	@Test
	public void test5thElementFromEndInLongList() {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(12);
		linkedList.add(8);
		linkedList.add(10);
		linkedList.add(11);
		linkedList.add(99);
		linkedList.add(88);
		linkedList.add(34);
		linkedList.add(62); //5th element from last.
		linkedList.add(77);
		linkedList.add(79);
		linkedList.add(90);
		linkedList.add(100);

		assertEquals(new Integer(62), LinkedListElement.get5thFromEnd(linkedList));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test5thElementWithShortList() {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		LinkedListElement.get5thFromEnd(linkedList);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test5thElementWithNullList() {
		LinkedListElement.get5thFromEnd(null);
	}
}
