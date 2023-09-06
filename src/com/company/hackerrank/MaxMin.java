package com.company.hackerrank;


import java.util.Collections;
import java.util.List;

/**
 * You will be given a list of integers, , and a single integer . You must create an array of length  from elements of  such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as
 *
 * Where:
 * - max denotes the largest integer in
 * - min denotes the smallest integer in
 * Example
 *
 *
 * Pick any two elements, say .
 *
 * Testing for all pairs, the solution  provides the minimum unfairness.
 * Note: Integers in  may not be unique.
 * Function Description
 * Complete the maxMin function in the editor below.
 * maxMin has the following parameter(s):
 * int k: the number of elements to select
 * int arr[n]:: an array of integers
 * Returns
 * int: the minimum possible unfairness
 * Input Format
 * The first line contains an integer , the number of elements in array .
 * The second line contains an integer .
 * Each of the next  lines contains an integer  where .
 * Constraints
 *
 *
 */
public class MaxMin {

    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.size() - k; i++) {
            int currentUnfairness = arr.get(i + k - 1) - arr.get(i);
            if (currentUnfairness < minUnfairness) {
                minUnfairness = currentUnfairness;
            }
        }
        return minUnfairness;
    }
}
