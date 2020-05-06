package SeleniumTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTests {
    
    @Test(priority = 2)
        public void test1(){
        hello("maraba televole");
    }

    @BeforeTest
    public void inform(){
        System.out.println("informing");
        hello();
        int i = 1;

        System.out.println("inform ends");
    }


    @Test(priority = 1)
    public void isPrime(){
        System.out.println("it is isprime");

    }

    public void hello(){
        System.out.println("Hello");
    }
    public void hello(String message){
        System.out.println(message);
    }
}
