package LogicTests;

import java.util.Stack;

public class AmazonQA {
    public static void main(String[] args) {
        String[] stringinput = {"abc", "def", "ghi","abc", "def", "ghi","abc", "def", "1"};
        String[] stringinput2 = {"abcx", "def", "ghix", "abc", "def", "ghi", "xasd", "1" };

        Stack<String> stackx = commonStrings(stringinput,stringinput2);
        for (String s:stackx) {
            System.out.println("Duplicates " + s);
        }
    }
    public static Stack<String> commonStrings(String[] a, String[] b) {
        Stack<String> x = new Stack();
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < b.length; j++){
                if(a[i].equals(b[j])){
                    if (!x.contains(a[i])){
                        x.push(a[i]);
                    }
                    break;
                }
            }
        }
    return x;
    }
}
/*
 int[]input1 = {1,2,10};
        int[]input2 = {2,9,1};
        for (int i =0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                System.out.println("Iteration i: "+i+" comparing " + input1[i] + " with " + input2[j]);
                if (input1[i] == input2[j]) {
                    System.out.println("BREAK1:duplicate " + input1[i] + " with " + input2[j]);
                    break;
                    } else if(j == input1.length-1) {
                    System.out.println("I am unique1 " + input1[i]);
                }
                    else {
                    for (int k = 0; k < input1.length; k++) {
                        System.out.println("Iteration reverse k: "+k+" comparing " + input2[j] + " with " + input1[k]);
                        if (input2[j] == input1[k]) {
                            System.out.println("BREAK2: reverse duplicate " + input2[j] + " with " + input1[k]);
                            break;
                        } else if (k == input1.length - 1) {
                            System.out.println("I am unique2 " + input2[j]);

                        }
                    }
                }
            }
        }
 */