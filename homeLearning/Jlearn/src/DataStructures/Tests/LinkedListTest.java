package DataStructures.Tests;

import DataStructures.Types.BasicLinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5,5);
        list.add(7);
        list.get(6);
        list.add(8);
        list.get(7);
        list.add(9);
        list.remove(8);
        list.add(10);
        list.remove(8);
        list.remove(7);
        list.remove(1);
        list.remove(2);
        for (int i =0; i <100 ; i++) {
            list.add(73);
        }



        list.toString();
        long end = System.currentTimeMillis();

        System.out.println("Time is "+ (end-start));



    }
}
