package DataStructures;

public class Test {
    public static void main(String args[]){
        BasicStack<String> stack = new BasicStack<>();
        stack.push("Ace of Spades");
        stack.push("2 of Spades");
        stack.push("3 of Spades");
        stack.push("4 of Spades");
        stack.push("5 of Spades");
        stack.push("6 of Spades");
        stack.push("7 of Spades");
        stack.push("8 of Spades");
        stack.push("9 of Spades");
        stack.push("10 of Spades");
        stack.push("Jack of Spades");
        stack.push("Queen of Spades");
        stack.push("King of Spades");

        //stack the diamond suit
        stack.push("Ace of Diamonds");
        stack.push("2 of Diamonds");
        stack.push("3 of Diamonds");
        stack.push("4 of Diamonds");
        stack.push("5 of Diamonds");
        stack.push("6 of Diamonds");
        stack.push("7 of Diamonds");
        stack.push("8 of Diamonds");
        stack.push("9 of Diamonds");
        stack.push("10 of Diamonds");
        stack.push("Jack of Diamonds");
        stack.push("Queen of Diamonds");
        stack.push("King of Diamonds");

        //stack the club suit
        stack.push("Ace of Clubs");
        stack.push("2 of Clubs");
        stack.push("3 of Clubs");
        stack.push("4 of Clubs");
        stack.push("5 of Clubs");
        stack.push("6 of Clubs");
        stack.push("7 of Clubs");
        stack.push("8 of Clubs");
        stack.push("9 of Clubs");
        stack.push("10 of Clubs");
        stack.push("Jack of Clubs");
        stack.push("Queen of Clubs");
        stack.push("King of Clubs");

        //stack the heart suit
        stack.push("Ace of Hearts");
        stack.push("2 of Hearts");
        stack.push("3 of Hearts");
        stack.push("4 of Hearts");
        stack.push("5 of Hearts");
        stack.push("6 of Hearts");
        stack.push("7 of Hearts");
        stack.push("8 of Hearts");
        stack.push("9 of Hearts");
        stack.push("10 of Hearts");
        stack.push("Jack of Hearts");
        stack.push("Queen of Hearts");
        stack.push("King of Hearts");

        System.out.println("s1 contains 9 "+stack.contains("9 of Hearts"));
        stack.access("Ace of Spadesx");
        System.out.println("s1 size is: "+stack.size());
    }

}
