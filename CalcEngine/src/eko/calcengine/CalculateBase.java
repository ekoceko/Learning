package eko.calcengine;

public abstract class CalculateBase {
    private double leftval;
    private double rightval;
    private double result;

    public double getLeftval(){
        return leftval;
    }
    public void setLeftval(double leftval){
        this.leftval = leftval;
    }
    public double getRightval() {
        return rightval;
    }
    public void setRightval(double rightval) {
        this.rightval = rightval;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double result){
        this.result = result;
    }

    public CalculateBase(){}

    public CalculateBase(double leftval, double rightval){
        this.leftval = leftval;
        this.rightval = rightval;
    }

    public abstract void calculate();

}
