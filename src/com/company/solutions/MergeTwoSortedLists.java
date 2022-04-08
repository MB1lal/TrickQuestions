package com.company.solutions;

import java.util.LinkedList;

public class MergeTwoSortedLists {

    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(8);
        list1.add(15);
        list1.add(19);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(7);
        list2.add(9);
        list2.add(10);
        list2.add(16);

        LinkedList<Integer> list3 = new LinkedList<>();
        int x = 0;
        int y = 0;

        do{
            if(x <4 && y<4) {
                if(list1.get(x) < list2.get(y)) {
                    list3.add(list1.get(x));
                    x++;
                }
                else {
                    list3.add(list2.get(y));
                    y++;
                }
            }
            else {
                if (x ==4) {
                    for(int i=y;i<=y;i++) {
                        list3.add(list2.get(i));
                    }
                }
                if (y ==4) {
                    for(int i=x;i<=x;i++) {
                        list3.add(list1.get(i));
                    }
                }
            }

        }while(list3.size() != (list1.size() + list2.size()));

        for (Integer integer : list3) {
            System.out.println(integer);
        }



    }
}
