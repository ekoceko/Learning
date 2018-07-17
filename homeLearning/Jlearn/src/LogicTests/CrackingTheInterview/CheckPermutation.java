package LogicTests.CrackingTheInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class CheckPermutation {
    //1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the
    //other.
    public static void main(String args[]){
        //sort
        //compare
        // or
        String input1 = "ekrem";
        String input2 = "ekemr";

        System.out.println(isPermutation(input1, input2));

    }
    public static boolean isPermutation(String string1, String string2){
        if (string1.length()!=string2.length()){
            return false;
        }
        char[] strArr1 = string1.toCharArray();
        char[] strArr2 = string2.toCharArray();
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        for (int i=0;i <string2.length();i++){
            if (strArr1[i]!=strArr2[i]){
                return false;
            }
        }
        return true;
    }
}
