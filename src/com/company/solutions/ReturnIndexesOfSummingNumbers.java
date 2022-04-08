package com.company.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnIndexesOfSummingNumbers {

    public static void main(String[] args) {

        int[] arr = new int[] {5, 7, 1, 2, 8, 4, 3};
        int target = 12;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
            int[] indexes = new int[2];
            List<Integer> foundValues = new ArrayList<>();

        for (int i=0; i< nums.length; i++) {
            if (foundValues.contains(target - nums[i])) {
                indexes[0] = foundValues.indexOf((target - nums[i]));
                indexes[1] = i;
                return indexes;
            }
            else {
                foundValues.add(nums[i]);
            }
        }
        return null;
        }

}
