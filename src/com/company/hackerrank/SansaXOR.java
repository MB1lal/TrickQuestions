package com.company.hackerrank;

import java.util.List;

/**
 * Sansa has an array. She wants to find the value obtained by XOR-ing the contiguous subarrays, followed by XOR-ing the values thus obtained. Determine this value.
 * Example
 *
 * Subarray	Operation	Result
 * 3		None		3
 * 4		None		4
 * 5		None		5
 * 3,4		3 XOR 4		7
 * 4,5		4 XOR 5		1
 * 3,4,5		3 XOR 4 XOR 5	2
 * Now we take the resultant values and XOR them together:
 * . Return .
 * Function Description
 * Complete the sansaXor function in the editor below.
 * sansaXor has the following parameter(s):
 * int arr[n]: an array of integers
 * Returns
 * int: the result of calculations
 * Input Format
 * The first line contains an integer , the number of the test cases.
 * Each of the next  pairs of lines is as follows:
 * - The first line of each test case contains an integer , the number of elements in .
 * - The second line of each test case contains  space-separated integers .
 * Constraints
 *
 *
 */
public class SansaXOR {
    public static int sansaXor(List<Integer> arr) {
        int result = arr.get(0);
        for(int i = 2; i < arr.size(); i += 2){
            result ^= arr.get(i);
        }
        return arr.size() % 2 == 0 ? 0 : result;
    }


}
