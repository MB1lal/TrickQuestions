package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        FindSumInArray.main(args);
//        FindMissingElementInSequentialArray.main(args);
//        MergeTwoSortedLists.main(args);
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("apple");
        list.add("apple apple");
        list.add("orange apple guava");
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).contains(" ")) {
                String[] test = list.get(i).split(" ");
                for(int j=0; j<test.length; j++) {
                    list2.add(test[j]);
                }
            }
            else {
                list2.add(list.get(i));
            }
        }
//        String[] test = list.get(0).split(" ");
        //(Arrays.stream(test).toList());
        System.out.println(list2);
    }
}


