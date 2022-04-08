package com.company.solutions;

import java.util.ArrayList;
import java.util.List;

/**
    You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
    Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
    Return a list of integers representing the size of these parts.
 */

public class ReturnNumberOfSetOfString {
        public static List<Integer> partitionLabels(String S) {
            int[] last = new int[26];
            for (int i = 0; i < S.length(); ++i)
                last[S.charAt(i) - 'a'] = i;

            int j = 0, anchor = 0;
            List<Integer> ans = new ArrayList();
            for (int i = 0; i < S.length(); ++i) {
                j = Math.max(j, last[S.charAt(i) - 'a']);
                if (i == j) {
                    ans.add(i - anchor + 1);
                    anchor = i + 1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        System.out.println(partitionLabels("aaabbbeeddfffffggfffhjghhhhhg"));
    }

}
