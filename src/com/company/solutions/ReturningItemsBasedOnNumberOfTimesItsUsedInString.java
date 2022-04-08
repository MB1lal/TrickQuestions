package com.company.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ReturningItemsBasedOnNumberOfTimesItsUsedInString {

    public static List<String> topNumCompetitors(int numCompetitors,
                                          int topNCompetitors,
                                          List<String> competitors,
                                          int numReviews,
                                          List<String> reviews)
    {
        List<String> res = new ArrayList<>();

        // Using set just for fast search
        Set<String> set = new HashSet<>(competitors);

        Map<String, Integer> count = new HashMap();


        for (String review : reviews) {
            Set<String> used = new HashSet<>();
            // splits whenever there is a non-alpha numeric character
            String[] words = review.toLowerCase().split(" ");
            for (String word : words) {
                if (set.contains(word) && !used.contains(word)) {
                    count.put(word, count.getOrDefault(word, 0) + 1);
                    used.add(word);
                }
            }
        }

        // Max heap for lexicographical order
        Queue<String> queue = new PriorityQueue<>(
                (a, b) -> (Objects.equals(count.get(a), count.get(b)) ? b.compareTo(a) : count.get(a) - count.get(b)));

        // keeping heap size of  topNCompetitors
        for (String s : count.keySet()) {
            queue.add(s);
            if (queue.size() > topNCompetitors) {
                queue.poll();
            }
        }


        while (!queue.isEmpty()) {
            res.add(queue.poll());
        }

        Collections.reverse(res);
        return res;


    }

    public static void main(String[] args) {
        List<String> reviews = new ArrayList(
                Arrays.asList("newshop is providing good services in the city; everyone should use newshop",
                        "best services by newshop", "fashionbeats has great services in the city",
                        "I am proud to have fashionbeats", "mymarket has awesome services",
                        "Thanks Newshop for the quick delivery"));

        List<String> competitors = new ArrayList<>(
                Arrays.asList("newshop", "shopnow", "afashion", "fashionbeats", "mymarket", "tcellular"));

        System.out.println(topNumCompetitors(6, 2, competitors, 6, reviews));
    }
}
