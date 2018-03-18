package eko.calcengine;

public class PowerOf extends CalculateBase implements MathProcessing {
    public PowerOf(double leftval, double rigtval) {
        super(leftval, rigtval);
    }
    public PowerOf(){}
    @Override
    public void calculate() {
        setResult(Math.pow(getLeftval(),getRightval()));
    }

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftval, double rightval) {

        return Math.pow(leftval,rightval);
    }
}
