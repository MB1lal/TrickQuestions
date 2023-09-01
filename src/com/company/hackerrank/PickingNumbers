import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to .

Example


There are two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

Function Description

Complete the pickingNumbers function in the editor below.

pickingNumbers has the following parameter(s):

int a[n]: an array of integers
Returns

int: the length of the longest subarray that meets the criterion
Input Format

The first line contains a single integer , the size of the array .
The second line contains  space-separated integers, each an .

Constraints

The answer will be .


*/
class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        a.sort(null);
    int l=0;
    int count=0;
    int min=a.get(0);
    for(int i=1; i<a.size(); i++){
        int x = a.get(i);
       if(Math.abs(x-min)<=1)
       count++;
       else {
          min = x;
          if(count>l)
          l=count;
          count=0; 
       }
    }
return count>0 && l==0 ? count+1 : l+1;

    }

}
