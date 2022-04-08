package com.company.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingMaxReturnableItems {

    private static Long returnMaxRetrievableItems(List<Long> products) {
        List<Long> maxReturnableItems = new ArrayList<>();
        long firstItem = products.get(0);

        for (int i=1; i<products.size()-2; i++) {
            if(products.get(i+1) < firstItem) {
                firstItem = firstItem - products.get(i);
                maxReturnableItems.add(firstItem);

                int j=i;
                do {
                    maxReturnableItems.set(i-1, (maxReturnableItems.get(i-1) + products.get(j)));
                    j++;
                }while(products.get(j) < products.get(j+1));
            }

        }


        return Collections.max(maxReturnableItems);
    }


    public static void main(String[] args) {
        List<Long> testData = new ArrayList<>();
        testData.add(7L);
        testData.add(4L);
        testData.add(5L);
        testData.add(8L);
        testData.add(4L);
        System.out.println(returnMaxRetrievableItems(testData));
    }
}
