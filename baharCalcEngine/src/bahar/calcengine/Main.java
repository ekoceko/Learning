package bahar.calcengine;

import ekoceko.Bow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> eko = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        eko.add("I am A string");

        String test = eko.get(0);
        stringList.add("I am also a String");

        Bow bow = new Bow();
        Bow bow2 = new Bow("Bahar");
        //Transversing a two dimensioned array//
        int[][] array = {{0,1,2,3,},
                        {5,6,7,8},
                        {10,11,12,13},
                        {15,16,17,18}};

        char charArray[] = {'a','b','z','w'};
        char charKey = 'g';
        System.out.println(charKey + " found at index "+ Arrays.binarySearch(charArray,charKey));;
        for (int i=0;i<4;++i) {
            for (int j = 0; j < 4; ++j) {

                System.out.print(array[i][j]);
            }
        }

            System.out.println(charArray);
            for (int k = 0; k<4;++k){
            for (int j=k; j<4;++j) {
                int t = array[k][j];
                array[k][j] = array[j][k];
                array[j][k] = t;
            }}}}





/*
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 45.0d, 60.0d, 3.0d};
        char[] opCodes = {'a', 's', 'd', 'm'};
        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(4.0d, 17.0d, 'm');
        equations[3] = create(240.0d, 50.0d, 's');

        for (MathEquation equation:equations)

        {
            equation.execute();
            System.out.print ("result = ");
            System.out.println(equation.getResult());
        }
    }

 public static MathEquation create(double leftVal, double rightVal, char opCode) {

        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }}
*/


