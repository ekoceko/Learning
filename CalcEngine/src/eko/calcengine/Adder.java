package eko.calcengine;

public class Adder extends CalculateBase implements  MathProcessing{

    public Adder(){}
    public Adder(double leftval, double rightval){
        super(leftval, rightval);
    }
    @Override
    public void calculate() {
        setResult(getLeftval()+getRightval());
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftval, double rightval) {
        setLeftval(leftval);
        setRightval(rightval);
        calculate();
        return getResult();
    }
}
