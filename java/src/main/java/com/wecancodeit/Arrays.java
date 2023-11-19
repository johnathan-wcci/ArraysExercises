package com.wecancodeit;

import java.util.Arrays;

public class Arrays {

    // Question 1
    /**
     * Given an array of integers, return true if 5 appears as either the first or last element in the array.
     * The array will have a length of at least 1.
	 *   Sample Input and Output:
     *firstLast5([5, 2, 3]) → true
     *firstLast5([1, 2, 5]) → true
     *firstLast5([3, 4, 7]) → false
     */
	public boolean containsFiveAtBeginningOrEnd(int[] nums) {
        
	}

    // Question 2
    /**
     * Given an array of strings, return true if the first and last strings in the array are equal.
     * The array will have a length of at least 1.
	 *    Sample Input and Output:
     * sameFirstLast(["apple", "banana", "cherry"]) → false
     * sameFirstLast(["apple", "banana", "cherry", "apple"]) → true
     * sameFirstLast(["cat", "dog", "cat"]) → true
     */
    public boolean areFirstAndLastStringsEqual(String[] strings) {
    }


    // Question 3
    /**
     * Given two arrays of characters, 'a' and 'b', return true if they have the same first element or the same last element.
     * Both arrays will have a length of at least 1.
	 * Sample Input and Output:
     * commonEnd(['x', 'y', 'z'], ['a', 'b', 'z']) → true
     * commonEnd(['p', 'q', 'r'], ['x', 'y', 'z']) → false
     * commonEnd(['a', 'b', 'c'], ['a', 'y', 'e']) → true
     */
	public boolean haveCommonFirstOrLastElement(char[] a, char[] b) {
		
	}

    // Question 4
    /**
     * Given an array of integers, return the sum of all the elements.
	 *    Sample Input and Output:
     * sumAll([1, 2, 3]) → 6
     * sumAll([5, 10, 15]) → 30
     * sumAll([7, 0, 0]) → 7
     */
    public int calculateSum(int[] nums) {
       
    }

    // Question 5
    /**
     * Given an array of integers, return a new array with the elements rotated one position to the left.
     *    Sample Input and Output:
     * rotateLeft([1, 2, 3]) → [2, 3, 1]
     * rotateLeft([4, 5, 6]) → [5, 6, 4]
     * rotateLeft([7, 8, 9]) → [8, 9, 7]
     */
    public int[] rotateLeftByOne(int[] nums) {
      
    }

    // Question 6
    /**
     * Given an array of integers, return a new array with the elements in reverse order.
	 * 
	 *    Sample Input and Output:
     * reverse([1, 2, 3]) → [3, 2, 1]
     * reverse([5, 10, 15]) → [15, 10, 5]
     * reverse([7, 8, 9]) → [9, 8, 7]
     */
    public int[] reverseArray(int[] nums) {
       
    }



    // Question 7
    /**
     * Given an array of integers, return the sum of the first two elements in the array.
     * If the array length is less than 2, sum up the elements that exist, and return 0 if the array is empty.
	 * 
	 *    Sample Input and Output:
     *  sumFirstTwo([1, 2, 3]) → 3
     *  sumFirstTwo([5]) → 5
     *  sumFirstTwo([7, 9]) → 16
     */
    public int getSumOfFirstTwo(int[] nums) {
      
    }

    // Question 8
    /**
     * Given two arrays of integers, each of length 3, return a new array of length 2 which contains the middle elements of both arrays.
	 * 
	 *     Sample Input and Output:
     *  middleTwo([1, 2, 3], [4, 5, 6]) → [2, 5]
     *  middleTwo([7, 7, 7], [3, 8, 0]) → [7, 8]
     *  middleTwo([5, 2, 9], [1, 4, 5]) → [2, 4]
     */
    public int[] getMiddleElements(int[] a, int[] b) {
        
    }
}
