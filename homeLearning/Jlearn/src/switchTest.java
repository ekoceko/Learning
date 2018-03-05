public class switchTest {

    public static void main (String args []){
        int dv = -0;

        switch (dv%3){
            case (0):
                System.out.println("I divide to 3");
                break;
            case (1):
                System.out.println("I am mod "+dv%3+" on base of 3");
                break;
            case (2):
                System.out.println("I am mod "+dv%3+" on base of 3");
                break;
            default:
                System.out.println("Only GOD can judge me!");
                break;

        }
    }
}
