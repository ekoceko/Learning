package eko.calcengine;

public class MathEquation {
    public double leftval;
    public double rightval;
    public char opCode;
    public double result;

    public void execute(){

        switch (opCode){
            case 'a':
                result= leftval+ rightval;
                break;
            case 's':
                result= leftval- rightval;
                break;
            case 'd':
                result= rightval !=0 ? leftval/rightval:0.0;
                break;
            case 'm':
                result= leftval * rightval;
                break;
            default:
                System.out.println("Wrong Operation");
                result= 0.0;
                break;
        }
    }

}

