package com.company.hackerrank;

/**
 * We define super digit of an integer  using the following rules:
 * Given an integer, we need to find the super digit of the integer.
 * If  has only  digit, then its super digit is .
 * Otherwise, the super digit of  is equal to the super digit of the sum of the digits of .
 * For example, the super digit of  will be calculated as:
 * 	super_digit(9875)   	9+8+7+5 = 29
 * 	super_digit(29) 	2 + 9 = 11
 * 	super_digit(11)		1 + 1 = 2
 * 	super_digit(2)		= 2
 * Example
 *
 *
 * The number  is created by concatenating the string   times so the initial .
 *     superDigit(p) = superDigit(9875987598759875)
 *                   9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5 = 116
 *     superDigit(p) = superDigit(116)
 *                   1+1+6 = 8
 *     superDigit(p) = superDigit(8)
 * All of the digits of  sum to . The digits of  sum to .   is only one digit, so it is the super digit.
 */

public class RecursiveDigitSum {
    private static Integer findSum(char[] array) {
        int sum = 0;
        for (char c : array) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    public static int superDigit(String n, int k) {
        n = n.replace("0", "");
        if(n.length() == 1 ) {
            return Integer.parseInt(n);
        }
        Integer sum = findSum(n.toCharArray());
        String appendedString = String.valueOf(sum);
        while(appendedString.length()>1){
            appendedString = String.valueOf(findSum(appendedString.toCharArray()));
        }
        sum = findSum(appendedString.toCharArray()) * k;
        appendedString = String.valueOf(sum);
        while(appendedString.length()>1) {
            appendedString = String.valueOf(findSum(appendedString.toCharArray()));
        }
        return Integer.parseInt(appendedString);
    }
}
