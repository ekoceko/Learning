package eko.calcengine;

public class Multiplier extends CalculateBase{
    public Multiplier(){}
    public Multiplier(double leftval, double rightval){
        super(leftval, rightval);
    }

    @Override
    public void calculate() {
        setResult(getLeftval()*getRightval());
    }
}
