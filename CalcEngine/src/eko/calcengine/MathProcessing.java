package eko.calcengine;

public interface MathProcessing {
    String SEPERATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculation(double leftval, double rightval);
}
