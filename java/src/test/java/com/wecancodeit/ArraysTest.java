package com.wecancodeit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(value = OrderAnnotation.class)
public class ArraysTest {
    Arrays exercises = new Arrays();
    @Test
	public void test01_containsFiveAtBeginningOrEnd() {
		assertTrue(exercises.containsFiveAtBeginningOrEnd(new int[]{5, 2, 3}));
		assertTrue(exercises.containsFiveAtBeginningOrEnd(new int[]{1, 2, 5}));
		assertFalse(exercises.containsFiveAtBeginningOrEnd(new int[]{3, 4, 1}));
	}
	
	
    @Test
    public void test02_areFirstAndLastStringsEqual() {
        assertFalse(exercises.areFirstAndLastStringsEqual(new String[]{"apple", "banana", "cherry"}));
        assertTrue(exercises.areFirstAndLastStringsEqual(new String[]{"apple", "banana", "cherry", "apple"}));
        assertTrue(exercises.areFirstAndLastStringsEqual(new String[]{"cat", "dog", "cat"}));
    }

@Test
public void test03_haveCommonFirstOrLastElement() {
    assertTrue(exercises.haveCommonFirstOrLastElement(new char[]{'a', 'b', 'c'}, new char[]{'a', 'd', 'e'}));
    assertTrue(exercises.haveCommonFirstOrLastElement(new char[]{'a', 'b', 'c'}, new char[]{'c', 'd', 'c'}));
    assertFalse(exercises.haveCommonFirstOrLastElement(new char[]{'a', 'b', 'c'}, new char[]{'d', 'e', 'f'}));
}



    @Test
    public void test04_calculateSum() {
        assertEquals(6, exercises.calculateSum(new int[]{1, 2, 3}));
        assertEquals(30, exercises.calculateSum(new int[]{5, 10, 15}));
        assertEquals(7, exercises.calculateSum(new int[]{7, 0, 0}));
    }

    @Test
    public void test05_rotateLeftByOne() {
        assertArrayEquals(new int[]{2, 3, 1}, exercises.rotateLeftByOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 6, 4}, exercises.rotateLeftByOne(new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{8, 9, 7}, exercises.rotateLeftByOne(new int[]{7, 8, 9}));
    }

    @Test
    public void test06_reverseArray() {
        assertArrayEquals(new int[]{3, 2, 1}, exercises.reverseArray(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{15, 10, 5}, exercises.reverseArray(new int[]{5, 10, 15}));
        assertArrayEquals(new int[]{9, 8, 7}, exercises.reverseArray(new int[]{7, 8, 9}));
    }


    @Test
    public void test07_getSumOfFirstTwo() {
        assertEquals(3, exercises.getSumOfFirstTwo(new int[]{1, 2, 3}));
        assertEquals(5, exercises.getSumOfFirstTwo(new int[]{5}));
        assertEquals(16, exercises.getSumOfFirstTwo(new int[]{7, 9}));
        assertEquals(0, exercises.getSumOfFirstTwo(new int[]{}));
    }

    @Test
    public void test08_getMiddleElements() {
        assertArrayEquals(new int[]{2, 5}, exercises.getMiddleElements(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 8}, exercises.getMiddleElements(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        assertArrayEquals(new int[]{2, 4}, exercises.getMiddleElements(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
    }
}