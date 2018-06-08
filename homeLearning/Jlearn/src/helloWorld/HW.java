package helloWorld;

public class HW {

    public static void main (String args[]){
        int factorial = 100;
        int key=4;
        /*
        while (key>1)
            factorial *= key--;

        first
        //comm
        second
         */
        //this is a standalone comment
        do {
            System.out.print(key);
            System.out.print(" * 2 = ");
            System.out.println(key *= 2);
        }
        while(key < factorial);

        for (int i = 4; i < 200; i *=2)
            System.out.println(i);
        System.out.println(factorial); //comment 1
        //System.out.println("hello home2");
        System.out.println(/*"hello home3"*/"no no no");

    }
}
