package eko.calcengine;

public class Subtracter extends CalculateBase {
    public Subtracter(){}
    public Subtracter(double leftval, double rightval){
        super(leftval,rightval);
    }

    @Override
    public void calculate() {
        setResult(getLeftval()-getRightval());
    }
}
