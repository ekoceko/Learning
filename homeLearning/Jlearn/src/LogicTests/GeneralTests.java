package LogicTests;

import javafx.collections.transformation.SortedList;

import java.util.*;

public class GeneralTests {
    public static void main(String args[]) {


    }


    public void firstUniqueChar(){
        String word = "asdasdasdasdasdasdasdXasdXasd";
        char[] chars = word.toCharArray();
        char unique = ' ';
        boolean ismatchfound = false;
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j <chars.length;j++){
                if (chars[i]==chars[j] && i!=j){
                    break; }
                else if (j+1==chars.length){
                    ismatchfound = true;
                    unique = chars[i];
                    break; }
            }
            if (ismatchfound){
                System.out.println("First Unique Char is "+ unique);
                break;}
        }
        System.out.println("No unique chars in this no of chars "+ chars.length);
    }

    public void stringToHashMap(){
        String usersfile = ("ekrem,Ekrem,bahar,Bahar,eko,ekocekO,ekoCeko,ekrem,bahar,Ekrem");
        String loweruUsersFile= usersfile.toLowerCase();
        String[]users= loweruUsersFile.split(",");
        HashMap<String,Integer> countableList = new HashMap<>();
        for (int i =0; i< users.length;i++){
            if (countableList.isEmpty())
                countableList.put(users[i],1);
            else if(countableList.get(users[i])== null) {
                countableList.put(users[i],1);
            }
            else if (countableList.containsKey(users[i])){
                countableList.put(users[i],countableList.get(users[i])+1);
            }
        }
        System.out.println(countableList);
    }
    public void findPrime(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++){list.add(i); }
        System.out.println(list);
        List<Integer> primes = new ArrayList<>();
        for (Integer prime:list) {
            boolean isPrimeNumber = true;
            System.out.println("number: "+prime);
            for(int j=2; j < prime; j++){
                if (prime%j==0){
                    isPrimeNumber=false;
                    break;}
            }
            if (isPrimeNumber ==true && prime.equals(1) == false)
                primes.add(prime);
        }
        System.out.println(primes);
    }
    public void sorter(){
        GeneralTests gt = new GeneralTests();
        //gt.replace();
        List<Integer> random = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * 100));
        }
        System.out.println("Random Numbers");
        System.out.println(random);
        System.out.println("Lamda sort");
        random.sort((a,b) -> (a-b));
        System.out.println(random);
        System.out.println("Lamda reverse");
        random.sort((a,b) -> (b-a));
        System.out.println(random);

        System.out.println(getSecondHighest(random));
        System.out.println("Reverse Sorted Numbers");
        Collections.sort(random, Collections.reverseOrder());
        System.out.println(random);
    }
    public static Integer getSecondHighest(List<Integer> list){
       Integer secondhighest = null;
        Collections.sort(list);
        System.out.println("get second highest list");
        System.out.println(list);
        //Second highest will be -1 from the length but we have to be sure if there is any duplicate
        for (int i = 0; i+1 < list.size(); i++){
            if (list.get(list.size()-(1+i))!= list.get(list.size()-(2+i))){
                secondhighest = (Integer) list.get(list.size()-(2+i));
                break;
            }
        }
        return secondhighest;
    }
    public static void replace(){
        String replaceme = "a1b2c3d4";
        String wordreplaced = replaceme.replaceAll("[zA-z]","");
        String numreplaced = replaceme.replaceAll("[0-9]","");
        System.out.println(wordreplaced);
        System.out.println(numreplaced);
    }
}
