package LogicTests.CrackingTheInterview;

import java.util.Arrays;

public class PalindromePermutation {
    /*
            1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of
    a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
    permutation is a rearrangement of letters. The palindrome does not need to be limited to just
    dictionary words.
             */
    public static void main(String args[]){

        //even number of everything
        //odd number of 1 thing MAX

        //sort string
        //check subsequent chars to count their numbers until length -1
        //break if 2 odd number chars
        System.out.println(isPalindromePermutation("22334455asdfdsa66"));


    }
    public static boolean isPalindromePermutation(String string){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        int maxOdds = 0;
        if (chars.length%2==1){
            maxOdds =1;
        }
        int oddNumCount = 0;
        int internalCOunter=1;
        for (int i = 0; i<chars.length-1;i++){

            System.out.println(i+" check if "+chars[i]+" and "+chars[i+1]+" are same. Internal count: "+internalCOunter);
            if (chars[i]==chars[i+1]){
                internalCOunter++;
                System.out.println("SAME! New internal counter: "+internalCOunter);
            }
            else if (internalCOunter%2==1) {
                oddNumCount++;
                System.out.println("FOUND ODD, new oddcount: " + oddNumCount);
                internalCOunter = 1;
                if (oddNumCount > maxOdds) {
                    return false;
                }
            }
            else {
                System.out.println("next element does not match but counter is even");
                internalCOunter=1;}
            if (i+1==chars.length-1&&internalCOunter%2==1){
                return false;
            }
        }
        return true;
    }
}
