package DataStructures.Types;

import java.util.ArrayList;
import java.util.Collection;

public class BasicCollection {

    public static class People{
        private String name;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        private int age;

        public People(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String toString(){
            return "Name: "+this.name+" & Age: "+this.age;
        }
    }
    public static void main(String[] args){
        Collection<People> people = new ArrayList<>();
        people.add(new People("Ekrem", 29));
        people.add(new People("Bahar", 28));
        people.add(new People("Minnoş", 0));


        people.add(new People("Hüseyin", 64));
        people.add(new People("Hüseyin", 68));
        people.add(new People("Mahpeyker", 65));
        people.add(new People("Güner", 59));
        //System.out.println(parents);
        System.out.println(people);
        Collection<People> parents = new ArrayList<>();

        for (People person: people) {
            System.out.println(people.size());
            System.out.println(parents.size());
            if (person.getAge()>50){
                parents.add(person);

            }
        }
        System.out.println("1");
        System.out.println(people);
        System.out.println(parents);
        people.removeAll(parents);
        System.out.println("2");
        System.out.println(people);
        System.out.println(parents);
        }

    }

