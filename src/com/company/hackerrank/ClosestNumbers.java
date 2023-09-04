package com.company.hackerrank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sorting is useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses as well. In this case, it will make it easier to determine which pair or pairs of elements have the smallest absolute difference between them.
 * Example
 *
 * Sorted, . Several pairs have the minimum difference of : . Return the array .
 * Note
 * As shown in the example, pairs may overlap.
 * Given a list of unsorted integers, , find the pair of elements that have the smallest absolute difference between them. If there are multiple pairs, find them all.
 * Function Description
 * Complete the closestNumbers function in the editor below.
 * closestNumbers has the following parameter(s):
 * int arr[n]: an array of integers
 * Returns
 * - int[]: an array of integers as described
 * Input Format
 * The first line contains a single integer , the length of .
 * The second line contains  space-separated integers, .
 * Constraints
 *
 *
 * All  are unique in .
 */
public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        int smallestDifference = Integer.MAX_VALUE;
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            int currentDifference = Math.abs(arr.get(i + 1) - arr.get(i));

            if (currentDifference < smallestDifference) {
                results.clear(); // Clear previous pairs if a smaller difference is found
                results.add(arr.get(i));
                results.add(arr.get(i + 1));
                smallestDifference = currentDifference;
            } else if (currentDifference == smallestDifference) {
                results.add(arr.get(i));
                results.add(arr.get(i + 1));
            }
        }

        return results;

    }
}
