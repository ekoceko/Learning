import java.util.*;

public class Collections {
    public static void main (String[] args){

         class Base {
            public void show() {
                System.out.println("Base::show() called");
            }
        }

         class Derived extends Base {
            public void show() {
                System.out.println("Derived::show() called");
            }
        }
        Base b = new Derived();;
        b.show();


        }
        //-----------------ArrayList------------------//
       /* ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Bahar");
        myArrayList.add("Ekrem");
        myArrayList.add("Timur");
        myArrayList.add("Inci");
        myArrayList.add("Leyla");
        myArrayList.add("Cek");
        System.out.println(myArrayList);
        //-----------------LınkedList------------------//
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Bahar");
        myLinkedList.add("Ekrem");
        myLinkedList.add("Timur");
        myLinkedList.add("Inci");
        myLinkedList.add("Leyla");
        myLinkedList.add("Cek");
        Iterator<String> myIterator = myLinkedList.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
        //-----------------Vector------------------//
        Vector<String> myVector = new Vector<String>();
        myVector.add("12");
        myVector.add("173");
        myVector.add("755");
        Iterator<String> myIteratorV = myVector.iterator();
        while (myIteratorV.hasNext()) {
            System.out.println(myIteratorV.next());
        }
        //-----------------Stack------------------//
        Stack<String> myStack = new Stack<String>();
        myStack.push("Ekrem");
        myStack.push("Bahar");
        myStack.pop();
        myStack.push("Inci");
        Iterator<String> myIteratorS = myStack.iterator();
        while (myIteratorS.hasNext()){
            System.out.println(myIteratorS.next());
        }*/
        //-----------------Queue------------------//
        /*Queue<Integer> myQueue = new LinkedList<>();

        for (int i=0; i<5; i++)
            myQueue.add(i);
        System.out.println("Elements of queue-"+myQueue);
        int removedone = myQueue.remove();
        System.out.println("Removed element is : "+ removedone);
        int removedtwo = myQueue.remove();
        System.out.println("Removed element is : "+ removedtwo);
        System.out.println(myQueue.poll());
        System.out.println("Elements of queue-"+myQueue);
        System.out.println(myQueue.peek());

        System.out.println(myQueue);
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);
        int size = myQueue.size();
        System.out.println("Size of queue-" + size);*/

        /*Iterator<String> myIteratorQ = myPQueue.iterator();
        while (myIteratorQ.hasNext()){
            System.out.println(myIteratorQ.next());
        }*/

        //-----------------Set------------------//
        //HashSet//
        /*HashSet<String> set=new HashSet<String>();
        set.add("Bahar");
        set.add("Ekrem");
        set.add("Tımur");
        set.add("Incı");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //LınkedHashSet//
        LinkedHashSet<String> linkedHset=new LinkedHashSet<String>();
        linkedHset.add("Ravi");
        linkedHset.add("Vijay");
        linkedHset.add("Ravi");
        linkedHset.add("Ajay");
        Iterator<String> itr2=linkedHset.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //SortedSet//

        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("13");
        treeSet.add("14");
        treeSet.add("16");
        treeSet.add("81");
//traversing elements
        Iterator<String> itr3=treeSet.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        //-----------------HashMap------------------//
        /*HashMap<String,String> myHashmap = new HashMap<String, String>();
        myHashmap.put("one","bahar");
        myHashmap.put("three","ekrem");
        myHashmap.put("7","cek");
        myHashmap.put("blank"," ");
        System.out.println("My Hashmap is: " + myHashmap);

        char[] array = {'a','c','d','a','b','e'};
        LinkedHashSet<String> mySet = new LinkedHashSet<>();
        mySet.add("Bahar");
        mySet.add("Ekrem'i");
        mySet.add("Cook ozlemis!");
        System.out.println("My LinkedHashSet is: "+mySet);
        System.out.println("My LinkedHashSet size is: "+mySet.size());
        System.out.println("My LinkedHashSet is: "+mySet.contains("Bahar"));
        System.out.println("My LinkedHashSet is: "+mySet.remove("Ekrem'i"));
        System.out.println("My LinkedHashSet is: "+mySet);
*/
    }



