package eko.calcengine;

public class Main {

    public static void main(String[] args) {
	double val1;
	double val2;
	double result;
	char opCode;

	val1=10.00;
	val2=0.00;
	opCode = 'd';

	if(opCode == 'a')
	    result = val1 + val2;
    else if(opCode== 's')
        result = val1 - val2;
    else if(opCode== 'd'){
        /*
        if(val2==0){
            System.out.println("Cannot divide by zero");
            result=0.0;
            }
        else
            */
        result = val2 != 0 ? val1 / val2: 0.0;
         }
    else if(opCode== 'm')
        result = val1 * val2;
    else {
        result = 0.0;
        System.out.println("invalid operation");
        }
    System.out.println("result is: "+result);
    }
}
