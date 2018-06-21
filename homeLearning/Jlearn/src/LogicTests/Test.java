package LogicTests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {
public static void main(String args[]) {


}
    public static void SortArray(int[] sortMe) {
        for (int i = 0; i < sortMe.length-1; i++) {
            for (int j = i + 1; j < sortMe.length; j++) {
                if (sortMe[i] > sortMe[j]) {
                    int k = sortMe[i];
                    sortMe[i] = sortMe[j];
                    sortMe[j] = k;
                    System.out.println("swapped");

                }
                PrintArray(sortMe);
            }
            System.out.println("end of i");
        }
    }
    public static void PrintArray(int[] array){
        for (int x:array) {
            System.out.print(x+", ");
        }
        System.out.println();
    }
}

