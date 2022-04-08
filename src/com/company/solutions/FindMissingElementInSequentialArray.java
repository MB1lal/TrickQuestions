package com.company.solutions;

import java.util.Arrays;

public class FindMissingElementInSequentialArray {

    public static void main(String[] args) {
        int[] v = new int[] {3, 7, 1, 2, 8, 4, 5};
        Arrays.sort(v);
        int x = v[0];
       for( int y=0; y<=(v.length-1); y++ ) {
           if(v[y+1] != (x+1) ){
               System.out.println("The missing number is " + (x+1));
               break;
           }
           else {
               x++;
           }
       }
    }

}
