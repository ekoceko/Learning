package LogicTests;

import java.util.HashSet;
import java.util.*;

public class GeneralTests {
    public static void main(String args[]) {
  
        }

public void findnumofchars(){
    String input = "aaasssdddqqqwwweasdasdqwwwqqee1233";
    String[] inputarray = input.split("");
    String s = "";
    int counter = 1;
    for (int i = 0; i < inputarray.length-1; i++) {
        if (!inputarray[i].equals(inputarray[i+1])){
            s += inputarray[i];
            s += String.valueOf(counter);
            counter = 1;
            System.out.println(inputarray[i]);
            System.out.println(s);
            if(i+1==inputarray.length-1){
                s+=inputarray[i+1];
                s+=1;
            }
        }
        else if(i+1==inputarray.length-1 && inputarray[i].equals(inputarray[i+1])){
            s+=inputarray[i];
            s += String.valueOf(counter+1);
        }
        else counter++;
    }
    System.out.println(s);
}
    public void replace2(){
        String input = "asdgasdqweasd123fasd1872edmasd8asd8";
        String newinput = input.replaceAll("[0-9]","");
        System.out.println(newinput);

    }
    public void getNthLargestwithCollection(){
        //get n'th largest
        int n = 2;
        Integer[] input = {1,2,3,3,3,4,5,6,3,2,4,1,3,4,5,6,7,8,9,3,2,11,3};
        TreeSet<Integer> uniqueinput = new TreeSet<>(Arrays.asList(input));
        ArrayList<Integer> sorteduniqueinput = new ArrayList(uniqueinput);
        Collections.sort(sorteduniqueinput, Collections.reverseOrder());
        System.out.println("The "+n+"th largest is: "+sorteduniqueinput.get(n-1));
    }
    public void amazonquestioncorrect(){
        //given integers and an int K, find pair of distinct integers whose sum equals K
        List<String> a = new ArrayList();
        a.add("3");
        a.add("ahmet");
        Integer b = 1;


        a.add("2");
        a.add(b.toString());
        a.add("ahmet");
        for (Object c:a) {
            System.out.print(c+", ");
        }
        System.out.println();
        System.out.println("Sorting");
        //Collections.sort(a,Collections.reverseOrder());

        Collections.sort(a);
        Collections.reverse(a);
        System.out.println(a);
        for (Object c:a) {
            System.out.print(c+", ");
        }

    }
    public static void amazonquestion(){
        int[] ints = {1,2,3,4,5,6,7,8,9,0,11,12,13,14,15};
        int k = 29;
        for (int i = 0; i < ints.length; i++){
            boolean isMatch = false;
            for (int j = i+1; j <ints.length;j++){
                if (k==(ints[i]+ints[j])){
                    System.out.println("match "+ints[i]+" "+ints[j]);
                    isMatch = true;
                    break;
                }
            }
            if (isMatch){
                System.out.println("OK");
                break;
            }
        }

    }
    public static int[] doSelectionSort(int[] arr){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");}
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) {
                    index = j;
                }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }






public void matchParanthesis (){
        //DOESNT WORK
    String p = "()(()())()((()))";
    String[] chars = p.split("");
    List<String> allchars = new ArrayList<>();
    allchars.addAll(Arrays.asList(chars));
    List<String> parantesis = new ArrayList<>();
    int lc = 0;
    int rc = 0;
    for (int i =0; i < allchars.size(); i++){
        if (allchars.get(i).equals("(")){
            lc +=1;
            parantesis.add(allchars.get(i));
            for (int j = i; j < allchars.size(); j++){
                if (allchars.get(j).equals(")")){
                    parantesis.add(allchars.get(j));
                    rc +=1;
                    break;
                }
            }
        }
        if (parantesis.size()>1&&parantesis.get(0).equals("(") && parantesis.get(1).equals(")")){
            parantesis.removeAll(parantesis);
        }
    }
    if (parantesis.isEmpty()) System.out.println("paranthesis MATCH!"+parantesis+lc+rc);
    else System.out.println("DOESNT MATCH"+lc+rc);

}


    public void reverseStringArray(){
        String[] strings = {"ekrem","mahmut","ahmet","ekrem","bahar"};

        List<String> reverseStrings = new ArrayList<>();

        reverseStrings.addAll(Arrays.asList(strings));
        Collections.reverse(reverseStrings);
        System.out.println(reverseStrings);
    }
public void getFirstUnique(){
    String input = "ekrermcekmcx";
    String[] inputarray = input.split("");
    List<String> allChars = new ArrayList<>();
    String  firstNonRep = null;
    allChars.addAll(Arrays.asList(inputarray));
    System.out.println(allChars);
    boolean isUnique = false;
    for (int i = 0; i < allChars.size(); i++){
        for (int j = 0; j < allChars.size(); j++){
            System.out.println("i is: "+ i +" value is: "+allChars.get(i) +" j is: "+ j+" value is: "+allChars.get(j));
            if (allChars.get(i).equals(allChars.get(j)) && i!=j){
                System.out.println("dup");
                break;
            }
            else if (j == allChars.size()-1){
                System.out.println("catch");
                isUnique = true;
                break;}
        }
        if (isUnique){
            firstNonRep = allChars.get(i);
            break;}
    }
    System.out.println(firstNonRep);
}
public void getDuplicates(){
    Integer[] input= new Integer[]{1,2,3,4,4,3,2,5,6,7,8};
    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(input));
    Set<Integer> duplicates = new HashSet<Integer>();
    boolean isDuplicate = false;
    for (int i =0; i < numbers.size();i++){
        isDuplicate = false;
        for (int j=0;j < numbers.size();j++){
            if (numbers.get(i) == numbers.get(j) && i!=j){
                isDuplicate = true;
                break;
            }
        }
        if(isDuplicate){
            duplicates.add(numbers.get(i));
        }
    }
    System.out.println("Duplicates: "+duplicates);
    numbers.removeAll(duplicates);
    System.out.println("No Duplicates: "+ numbers);
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
