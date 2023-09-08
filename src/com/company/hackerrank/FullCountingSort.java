package com.company.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 */
public class FullCountingSort {
    public static void countSort(List<List<String>> arr) {

        StringBuilder [] arrList = new StringBuilder[101];
        StringBuilder st;
        for(int i=0;i<arr.size();i++) {
            if(i < arr.size()/2) {
                arr.get(i).set(1, "-");
            }
            st = arrList[Integer.parseInt(arr.get(i).get(0))];
            if(st == null) {
                st = new StringBuilder();
            }
            arrList[Integer.parseInt(arr.get(i).get(0))] = st.append(arr.get(i).get(1)).append(" ");
        }

        System.out.println(Arrays.stream(arrList).filter(Objects::nonNull).toList().toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace("  ", " ")
        );

    }

}
