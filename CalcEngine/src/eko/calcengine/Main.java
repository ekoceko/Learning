package eko.calcengine;

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
  public static void main(String[] args) {
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
     */
    MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.00,40.00,'a');
        equations[1] = new MathEquation(50.00,40.00,'s');
        equations[2] = new MathEquation(20.00,40.00,'m');
        equations[3] = new MathEquation(10.00,40.00,'d');

        for (MathEquation equation: equations){
            equation.execute();
            System.out.println("Result for operation "+equation.getOpCode()+" is: "+ equation.getResult());
        }
	/*
	opCode = 'd';

	if(opCode == 'a')
	    result = val1 + val2;
    else if(opCode== 's')
        result = val1 - val2;
    else if(opCode== 'd'){

        if(val2==0){
            System.out.println("Cannot divide by zero");
            result=0.0;
            }
        else

        result = val2 != 0 ? val1 / val2: 0.0;
         }
    else if(opCode== 'm')
        result = val1 * val2;
    else {
        result = 0.0;
        System.out.println("invalid operation");
        }
    System.out.println("result is: "+result);


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
