package com.ant;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {

	@Before
	public void setUp() throws Exception {
		// 无需特殊初始化
	}

	@After
	public void tearDown() throws Exception {
		// 无需特殊清理
	}

	@Test
	public void testAddE() {
		MyLinkedList list = new MyLinkedList();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		assertEquals(2, list.size);
	}

	@Test
	public void testRemoveObject() {
		MyLinkedList list = new MyLinkedList();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		list.remove(0);
		assertEquals(1, list.size);
		assertEquals(2, list.get(0));
	}

	@Test
	public void testPush() {
		MyLinkedList list = new MyLinkedList();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		assertEquals(2, list.size);

	}
}
