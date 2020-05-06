package helloWorld;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args){
        StringJoiner sj = new StringJoiner("_", "Prefix ", " PostFix");
        sj.add("E").add("K").add("R").add("E").add("M");
        System.out.println(sj.toString());
        StringJoiner sj2 = new StringJoiner("_", "Prefix ", " PostFix");
        sj2.add("Only1Value");
        System.out.println(sj2.toString());
        double test = 13/3;
        String out = String.format("My name is %s and I am %d years old. 13/5 is %.2f", "Ekrem", 30, test);
        System.out.println(out);

        //%[argument index] [flags] [width] [precision] conversion
        //CONVERSIONS d decimal, o Octal, x X Hex, f Decimal floating point, e E Scientific Notation, s String
        //FLAGS # includes base/radix, 0 zero padding, - left justify, include group separator (%,d), space leave space for pozitive numbers (% d)
        //Flags cont, + puts sign for positive numbers as well, ( wraps number in parenthesis
        //WIDTH any number puts that many spaces
    }
}
