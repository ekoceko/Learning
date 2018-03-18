package eko.calcengine;

public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }

    public String process(String statement){

        String[] parts = statement.split(MathProcessing.SEPERATOR);
        String keyword = parts[0];

        MathProcessing theHandler = null;

        for (MathProcessing handler: handlers){
            if (keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandler = handler;
                break;
            };
        }
        double leftval =  Double.parseDouble(parts[1]);
        double righval =  Double.parseDouble(parts[2]);
        double result = theHandler.doCalculation(leftval,righval);

        StringBuilder resultString = new StringBuilder(50);
        resultString.append(leftval);
        resultString.append(" "+theHandler.getSymbol()+" ");
        resultString.append(righval);
        resultString.append(" = ");
        resultString.append(result);
        String finalResult = resultString.toString();
        return finalResult;
    }
}
