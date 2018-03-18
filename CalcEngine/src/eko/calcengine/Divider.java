package eko.calcengine;

public class Divider extends CalculateBase{

    public Divider(){}
    public Divider(double leftval, double rightval){
        super(leftval, rightval);
    }
    @Override
    public void calculate() {
        if (getRightval()!=0){
            setResult(getLeftval()/getRightval());
        }
        else
            setResult(0);
    }
}
