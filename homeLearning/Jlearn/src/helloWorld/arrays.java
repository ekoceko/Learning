package helloWorld;

public class arrays {

    public static void main (String args []){
        int myArray[] = {11, 22, 33, 44, 55};
        int myArray2[] = {11, 22, 33, 44, 55, -100};

        int sum = 0;
        int sum2 = 0;
        /*
        for(int i =0;i < myArray.length;i++){
            sum += myArray[i];
            System.out.println("sum is now: "+sum);
        }
        */
        for (int cur:myArray2) {
            sum2 += cur;
            System.out.println("sum2 is now: "+sum2);
        }
        System.out.println("final sum is "+sum);
        System.out.println("final sum2 is "+sum2);
    }
}
