package eko.calcengine;

public class MathEquation {
    private double leftval;
    private double rightval;
    private char opCode;
    private double result;
    public MathEquation (){

    }
    public MathEquation (char opCode){
        this.opCode = opCode;
    }
    public MathEquation (double leftval, double rightval, char opCode){
        this(opCode);
        this.rightval = rightval;
        this.leftval = leftval;
    }

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
    public double getLeftval(){return leftval; }
    public void setLeftval(double leftval) {this.leftval = leftval; }

    public double getRightval(){return rightval; }
    public void setRightval(double rightval){this.rightval = rightval; }

    public char getOpCode(){return opCode; }
    public void setOpCode(char opCode){this.opCode = opCode;}

    public double getResult(){return result;}
}

