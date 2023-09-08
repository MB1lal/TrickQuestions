package com.company.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.
 * Example
 *
 * The grid is illustrated below.
 * a b c
 * a d e
 * e f g
 * The rows are already in alphabetical order. The columns a a e, b d f and c e g are also in alphabetical order, so the answer would be YES. Only elements within the same row can be rearranged. They cannot be moved to a different row.
 * Function Description
 * Complete the gridChallenge function in the editor below.
 * gridChallenge has the following parameter(s):
 * string grid[n]: an array of strings
 * Returns
 * string: either YES or NO
 * Input Format
 * The first line contains , the number of testcases.
 * Each of the next  sets of lines are described as follows:
 * - The first line contains , the number of rows and columns in the grid.
 * - The next  lines contains a string of length
 */
public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        String result = "";
        List<String> sortedGrid = new ArrayList<>();
        for (String string : grid) {
            char[] temp = string.toCharArray();
            Arrays.sort(temp);
            sortedGrid.add(Arrays.toString(temp).replace("[", "").replace("]", "").replace(", ", "").trim());
        }
        int rowSize = sortedGrid.get(0).length();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < sortedGrid.size()-1; j++) {
                if(sortedGrid.get(j).charAt(i) > sortedGrid.get(j+1).charAt(i)) {
                    result = "NO";
                    break;
                }
            }
            if(result.equals("NO")){
                break;
            }
        }
        if(!result.equals("NO")) {
            result = "YES";
        }
        return result;

    }
}
