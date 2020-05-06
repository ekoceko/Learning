package LogicTests.CrackingTheInterview;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("result is: "+nthFibNum(100));

    }
    public static BigInteger nthFibNum(int n){
        if(n<=0){ return BigInteger.valueOf(-1);} //can throw error also}
        else if(n==1){ return BigInteger.valueOf(0);}
        BigInteger first = BigInteger.valueOf(0);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger fib= BigInteger.valueOf(0);
        for (int i = 2; i <=n;i++){
            fib = first.add(second) ;
            System.out.println(i+"th fib is: "+fib);
            second = first;
            first = fib;
        }
        return fib;
    }
}
