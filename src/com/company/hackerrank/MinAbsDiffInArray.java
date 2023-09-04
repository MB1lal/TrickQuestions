package com.company.hackerrank;

import java.util.Collections;
import java.util.List;

/**
 * The absolute difference is the positive difference between two values  and , is written  or  and they are equal. If  and , . Given an array of integers, find the minimum absolute difference between any two elements in the array.
 * Example.
 * There are  pairs of numbers:  and . The absolute differences for these pairs are ,  and . The minimum absolute difference is .
 * Function Description
 * Complete the minimumAbsoluteDifference function in the editor below. It should return an integer that represents the minimum absolute difference between any pair of elements.
 * minimumAbsoluteDifference has the following parameter(s):
 * int arr[n]: an array of integers
 * Returns
 * int: the minimum absolute difference found
 * Input Format
 * The first line contains a single integer , the size of .
 * The second line contains  space-separated integers, .
 * Constraints
 */
public class MinAbsDiffInArray {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            int temp = Math.abs(arr.get(i) - arr.get(i+1));
            if( temp < minDiff) {
                minDiff = temp;
            }
        }
        return minDiff;
    }
}
