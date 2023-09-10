package com.company.hackerrank;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.
 * Example
 *
 *  is between two subarrays that sum to .
 *
 * The answer is  since left and right sum to .
 * You will be given arrays of integers and must determine whether there is an element that meets the criterion. If there is, return YES. Otherwise, return NO.
 * Function Description
 * Complete the balancedSums function in the editor below.
 * balancedSums has the following parameter(s):
 * int arr[n]: an array of integers
 * Returns
 * string: either YES or NO
 */
public class SherlockAndArray {

    public static String balancedSums(List<Integer> arr) {
        AtomicInteger totalSum = new AtomicInteger();
        int leftSum = 0;
        int rightSum;

        arr.forEach(totalSum::addAndGet);
        for (int i = 0; i < arr.size(); i++) {
            rightSum = totalSum.get() - leftSum - arr.get(i);

            if (leftSum == rightSum) {
                return "YES";
            }

            leftSum += arr.get(i);
        }

        return "NO";

    }
}
