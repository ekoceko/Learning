package LogicTests.CrackingTheInterview;

import java.util.HashMap;

public class IsUnique {

    public static void main(String args[]){
        //1.1
        //Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
        //cannot use additional data structures
        String input = "abcde";

        System.out.println(isUnique(input));

    }
    public static boolean isUnique(String input){
        boolean isUnique = true;
        for (int i =0; i< input.length();i++){
            for (int j =i+1;j <input.length();j++){
                if (input.charAt(i)==input.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if (!isUnique){
                break;
            }
        }

        return isUnique;
    }
}
