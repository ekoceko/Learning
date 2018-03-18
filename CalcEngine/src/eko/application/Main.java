package eko.application;

import eko.calcengine.*;

public class Main {
    /*
  private static MathEquation create (double leftVal, double rightVal, char opCode) {
      MathEquation equation = new MathEquation();
      equation.setLeftval(leftVal);
      equation.setRightval(rightVal);
      equation.setOpCode(opCode);
      return equation;
}
*/
  public static void main(String[] args)  {

      String[] statements = {
              "add 1.0",
              "add xx 1.5",
              "addx 1.0 1.4",
              "divide 100.00 50.00",
              "add 5.00 10.00",
              "subtract 412.00 212.00",
              "multiply 50.00 20.00"};
      CalculateHelper ch = new CalculateHelper();
      for (String statement:statements) {
           try {
               ch.process(statement);
               System.out.println(ch);
           }catch (InvalidStatementException i){
               System.out.println(i.getMessage());
               if (i.getCause()!=null)
                   System.out.println("Original Cause: "+i.getCause().getMessage());
           }


      }




   /*
      double[] leftvals  = {10.00, 20.00, 30.00, 40.00};
  double[] rightvals = {50.00, 60.00, 0.00, 2.00};
  char[] opCodes = {'a','s','d','m'};
  double[] results = new double[opCodes.length];
  */
       /*
     MathEquation firsteq = new MathEquation();
     firsteq.execute();
     firsteq.getResult();

       Adder add = new Adder(3,4);
       add.calculate();
       Subtracter sub = new Subtracter(1,3);
       sub.calculate();
       Multiplier mul = new Multiplier(5,9);
       mul.calculate();
       Divider divtozero = new Divider(5,0);
       divtozero.calculate();
      Divider divtox = new Divider(50,10);
      divtox.calculate();
    */



      CalculateBase[] calculateBases = {
              new Adder(3,4),
              new Subtracter(1,3),
              new Multiplier(5,9),
              new Divider(50,10)};

      for (CalculateBase calculateBase:calculateBases){
          calculateBase.calculate();
          System.out.println("result of operation "+calculateBase.getClass()+" is: "+calculateBase.getResult());
      }

      /*
      for(int i= 0; i < calculateBases.length;i++){
          calculateBases[i].calculate();
          System.out.println("result of operation "+(i+1)+" is: "+calculateBases[i].getResult());
      }






      /*
    MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.00,40.00,'a');
        equations[1] = new MathEquation(50.00,40.00,'s');
        equations[2] = new MathEquation(20.00,40.00,'m');
        equations[3] = new MathEquation(10.00,40.00,'d');

        for (MathEquation equation: equations){
            equation.execute();
            System.out.println("Result for operation "+equation.getOpCode()+" is: "+ equation.getResult());
        }
      System.out.println("starting overloads");
double lv = 10.0;
double rv = 4.0;
int lvi = 10;
int rvi = 4;
      MathEquation eqoverloaddiv = new MathEquation('d');
        eqoverloaddiv.execute(lv,rv);
      System.out.println("Result for overload operation "+eqoverloaddiv.getOpCode()+" is: "+ eqoverloaddiv.getResult());
      eqoverloaddiv.execute(lvi,rvi);
      System.out.println("Result for overload operation "+eqoverloaddiv.getOpCode()+" is: "+ eqoverloaddiv.getResult());

      */
      /*
          //IF ARRAY
    for (int i = 0; i < opCodes.length; i++) {

            if (opCodes[i] =='a'){
                results[i]= leftvals[i]+ rightvals[i];

            }
            else if (opCodes[i] =='s'){
                results[i]= leftvals[i]- rightvals[i];

            }
            else if (opCodes[i] =='d'){
                results[i]= rightvals[i] !=0 ? leftvals[i]/rightvals[i]:0.0;
            }
            else if (opCodes[i] =='m'){
                results[i]= leftvals[i] * rightvals[i];

            }
        }
        for (int i = 0; i < results.length;i++){
            System.out.println("Result of "+opCodes[i]+" operation is: "+results[i]);
        }
     //////////// SWITCH

             for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]){
                case 'a':
                    results[i]= leftvals[i]+ rightvals[i];
                    break;
                case 's':
                    results[i]= leftvals[i]- rightvals[i];
                    break;
                case 'd':
                    results[i]= rightvals[i] !=0 ? leftvals[i]/rightvals[i]:0.0;
                    break;
                case 'm':
                    results[i]= leftvals[i] * rightvals[i];
                    break;
                default:
                    System.out.println("Wrong Operation");
                    break;
            }
        }
     */
    }
}
