package com.company.hackerrank;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
 * Example
 *
 * There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .
 * Function Description
 * Complete the migratoryBirds function in the editor below.
 * migratoryBirds has the following parameter(s):
 * int arr[n]: the types of birds sighted
 * Returns
 * int: the lowest type id of the most frequently sighted birds
 * Input Format
 * The first line contains an integer, , the size of .
 * The second line describes  as  space-separated integers, each a type number of the bird sighted.
 * Constraints
 *
 * It is guaranteed that each type is , , , , or .
 */
public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        List<Integer> distinctBirds = arr.stream().distinct().toList();
        Map<Integer, Integer> birdMap = new TreeMap<>();
        for (int bird : distinctBirds) {
            int cnt = Collections.frequency(arr, bird);
            birdMap.put(bird, cnt);
        }

        int max = 0, id = 0;
        for (Map.Entry<Integer, Integer> entry : birdMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                id = entry.getKey();
            }
        }
        return id;
    }
}
