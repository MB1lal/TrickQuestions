package com.company.solutions;

import java.util.HashSet;
import java.util.Set;

public class FindSumInArray {

    static boolean findSumOfTwo(int[] A, int val) {
        Set<Integer> foundValues = new HashSet<>();
        // Subtracts the element and if the second element is part of collection
        // it means it can be summed
        for (int a : A) {
            if (foundValues.contains(val - a)) {
                return true;
            }

            foundValues.add(a);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
        int[] test = new int[] {3, 20, 1, 2, 7};

        for (int j : test) {
            boolean output = findSumOfTwo(v, j);
            System.out.println("findSumOfTwo(v, " + j + ") = " + (output ? "true" : "false"));
        }


    }

}
