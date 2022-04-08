package com.company.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualDistributionPuzzle {

    public static int minimumIntValue(List<Integer> data){
        int smallest = Collections.max(data);
        for(int i=0; i< data.size(); i++){
            if(smallest < data.get(i) && smallest != 0) {
                smallest = data.get(i);
            }
        }
        return smallest;

    }
    public static int getMinimumDays(List<Integer> parcels) {
        int numOfParcelsToDeliver = Collections.min(parcels);
        int daysRequired = 1;

        if(Collections.max(parcels) == 0) { return 0;}

        do {
            for(int i=0; i< parcels.size(); i++) {
                if(!(parcels.get(i) <= 0)){
                    parcels.set(i, (parcels.get(i)- numOfParcelsToDeliver));
                }
            }
            daysRequired +=1;
            numOfParcelsToDeliver = minimumIntValue(parcels);

        }while(numOfParcelsToDeliver != 0);

        return daysRequired;

    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(6);
        data.add(3);
        data.add(3);
        data.add(3);
        data.add(3);

        System.out.println(getMinimumDays(data));
    }
}
