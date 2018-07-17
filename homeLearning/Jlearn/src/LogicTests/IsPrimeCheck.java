package LogicTests;

import java.util.Scanner;

public class IsPrimeCheck {

    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int input = s1.nextInt();
        System.out.println("Checking if "+input+" is prime..");
        System.out.println("result is : "+isPrime(input));

    }
    public static boolean isPrime(int number){
            for (int i = 2; i*i<=number;i++){
                System.out.println("checking if: "+number+" can be divided to: "+i+" while i < "+i*i);
            if (number%i==0){
                System.out.println("Not Prime");
                return false;
            }
        }
        return true;
    }
}
