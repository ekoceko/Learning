package LogicTests.CrackingTheInterview;

import java.util.Stack;

public class ParanthesisBalance {
    public static void main(String[] args){
        String input = "({}[{()}]())";
        System.out.println(isBalanced(input));
    }
    public static boolean isBalanced(String input){

        Stack<Character> s = new Stack<>();
        if (input.charAt(0)==']'||input.charAt(0)==')'||input.charAt(0)==']'){
            return false;
        }
        for (int i =0;i < input.length();i++)
            if (input.charAt(i)=='('||input.charAt(i)=='['||input.charAt(i)=='{') {
                s.push(input.charAt(i));
            }
            else if (input.charAt(i)==')') {
                if (s.pop()!='('){
                    return false;
                }
            }
            else if (input.charAt(i)==']'){
                if (s.pop()!='['){
                    return false;
                }
            }
            else if (input.charAt(i)=='}'){
                if (s.pop()!='{'){
                    return false;
                }
            }
        return true;
    }
}
