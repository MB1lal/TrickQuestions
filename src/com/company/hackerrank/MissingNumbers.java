package com.company.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two arrays of integers, find which elements in the second array are missing from the first array.
 * Example
 *
 *
 * The  array is the orginal list. The numbers missing are .
 * Notes
 * If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
 * Return the missing numbers sorted ascending.
 * Only include a missing number once, even if it is missing multiple times.
 * The difference between the maximum and minimum numbers in the original list is less than or equal to .
 * Function Description
 * Complete the missingNumbers function in the editor below. It should return a sorted array of missing numbers.
 * missingNumbers has the following parameter(s):
 * int arr[n]: the array with missing numbers
 * int brr[m]: the original array of numbers
 * Returns
 * int[]: an array of integers
 * Input Format
 * There will be four lines of input:
 *  - the size of the first list,
 * The next line contains  space-separated integers
 *  - the size of the second list,
 * The next line contains  space-separated integers
 */

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> bMap = new HashMap<>();
        for (Integer integer : brr) {
            bMap.put(integer, bMap.getOrDefault(integer, 0)+1);
        }
        Map<Integer, Integer> aMap = new HashMap<>();
        for (Integer integer : arr) {
            aMap.put(integer, aMap.getOrDefault(integer, 0)+1);
        }

        List<Integer> missing = new ArrayList<>();

        for (Integer element: bMap.keySet()) {
            if(aMap.containsKey(element)) {
                if(bMap.get(element) > aMap.get(element)) {
                    missing.add(element);
                }
            } else {
                missing.add(element);
            }
        }
        Collections.sort(missing);
        return missing;



    }
}
