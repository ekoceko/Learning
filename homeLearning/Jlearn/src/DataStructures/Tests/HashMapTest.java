package DataStructures.Tests;

import DataStructures.Types.BasicHashMap;

public class HashMapTest {
    public static void main(String args[]){
        BasicHashMap m1 = new BasicHashMap(100);
        for (int i = 1000000000; i < 1000000100; i++){
            m1.put(i,"tasdasdasdasdasd");
        }
        m1.printAll();

        for (int i = 1000000000; i < 1000000100; i++){
            m1.delete(i);
        }
        System.out.println("printing all");
        m1.printAll();
    }
}
