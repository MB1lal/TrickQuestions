package com.company.hackerrank;

/**
 * Given an integer , find each  such that:
 *
 *
 * where  denotes the bitwise XOR operator. Return the number of 's satisfying the criteria.
 * Example
 *
 * There are four values that meet the criteria:
 *
 *
 *
 *
 * Return .
 * Function Description
 * Complete the sumXor function in the editor below.
 * sumXor has the following parameter(s):
 * - int n: an integer
 * Returns
 * - int: the number of values found
 */
public class SumVsXOR {
    public static long sumXor(long n) {
        if(n==0){
            return 1;
        } else {
            return (long)(Math.pow(2, Long.toBinaryString(n).chars().filter(x -> x=='0').count()));
        }
    }
}
