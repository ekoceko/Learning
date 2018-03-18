package eko.calcengine;

public class Adder extends CalculateBase{

    public Adder(){}
    public Adder(double leftval, double rightval){
        super(leftval, rightval);
    }
    @Override
    public void calculate() {
        setResult(getLeftval()+getRightval());
    }
}
