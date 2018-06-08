package eko.calcengine;

public class CalculateHelper {
    public static final char ADD_SYMBOL = '+';
    public static final char SUBSTRACT_SYMBOL = '-';
    public static final char DIVIDE_SYMBOL = '/';
    public static final char MULTIPLY_SYMBOL = '*';
    MathCommand mathCommand;
    double leftvalue;
    double rightvalue;
    double result;

    public void process(String statement) throws InvalidStatementException {
        //add 1.00 2.00
        String[] parts = statement.split(" ");
        if (parts.length != 3){
            throw new InvalidStatementException("Incorrect No of statements",statement);
        }
        String commandString = parts[0];
        try {
            leftvalue = Double.parseDouble(parts[1]);
            rightvalue = Double.parseDouble(parts[2]);
        }
        catch (NumberFormatException e){
            throw new InvalidStatementException("Incorrect Number format", statement, e);
        }

        setCommandFromString(commandString);

        CalculateBase calculateBase = null;

        switch (mathCommand){
            case Add:
                calculateBase = new Adder(leftvalue,rightvalue);
                break;
            case Subtract:
                calculateBase = new Subtracter(leftvalue,rightvalue);
                break;
            case Divide:
                calculateBase = new Divider(leftvalue,rightvalue);
                break;
            case Multiply:
                calculateBase = new Multiplier(leftvalue,rightvalue);
                break;
        }
        calculateBase.calculate();
       result = calculateBase.getResult();

    }

 @Override
    public String toString(){
        char symbol = ' ';
        switch (mathCommand){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBSTRACT_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;

        }
        StringBuilder resultString = new StringBuilder(50);
        resultString.append(leftvalue);
        resultString.append(" "+symbol+" ");
        resultString.append(rightvalue);
        resultString.append(" = ");
        resultString.append(result);
        String finalResult = resultString.toString();
        return finalResult;
    }

    private void setCommandFromString(String commandString) throws InvalidStatementException {
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString())){
            mathCommand = MathCommand.Add;
        }
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())){
            mathCommand = MathCommand.Subtract;
        }
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())){
            mathCommand = MathCommand.Divide;
        }
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())){
            mathCommand = MathCommand.Multiply;
        }
        else throw new InvalidStatementException("Incorrect command type",commandString);
    }
}
