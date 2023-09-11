package com.company.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * We define a magic square to be an  matrix of distinct positive integers from  to  where the sum of any row, column, or diagonal of length  is always equal to the same number: the magic constant.
 * You will be given a  matrix  of integers in the inclusive range . We can convert any digit  to any other digit  in the range  at cost of . Given , convert it into a magic square at minimal cost. Print this cost on a new line.
 * Note: The resulting magic square must contain distinct integers in the inclusive range .
 * Example
 * $s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]
 * The matrix looks like this:
 * 5 3 4
 * 1 5 8
 * 6 4 2
 * We can convert it to the following magic square:
 * 8 3 4
 * 1 5 9
 * 6 7 2
 * This took three replacements at a cost of
 */
public class MagicSquare {
    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<Integer>> magicSquares = Arrays.asList(
                Arrays.asList(8, 1, 6, 3, 5, 7, 4, 9, 2),
                Arrays.asList(6, 1, 8, 7, 5, 3, 2, 9, 4),
                Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6),
                Arrays.asList(2, 9, 4, 7, 5, 3, 6, 1, 8),
                Arrays.asList(8, 3, 4, 1, 5, 9, 6, 7, 2),
                Arrays.asList(4, 3, 8, 9, 5, 1, 2, 7, 6),
                Arrays.asList(6, 7, 2, 1, 5, 9, 8, 3, 4),
                Arrays.asList(2, 7, 6, 9, 5, 1, 4, 3, 8)
        );
        int minCost = Integer.MAX_VALUE;

        for (List<Integer> magicSquare : magicSquares) {
            int cost = 0;
            for (int i = 0; i < 9; i++) {
                cost += Math.abs(s.get(i / 3).get(i % 3) - magicSquare.get(i));
            }
            minCost = Math.min(minCost, cost);
        }

        return minCost;

    }
}
