package com.company.solutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopNFrequentWords {

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> count = new HashMap<>();
        for(String items : words) {
            if(count.containsKey(items)) {
                count.put(items,(count.get(items)+1));
            }
            else {
                count.put(items,1);
            }
        }

        for(String items : count.keySet()) {
            if(count.get(items) >= k) {
                result.add(items);
            }
        }

        result.sort(Comparator.naturalOrder());

        return result;

    }

    public static void main(String[] args) {
        String[] sentence = new String[] { "i","a","c","i","c","c","a"};

        List<String>  result = topKFrequent(sentence,3);
        System.out.println(result.get(0));
    }
}
