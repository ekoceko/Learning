package eko.cars;

public class InheritMe {

    public static void main(String[] args){
    Car c1 = new Car();
    BMW b1 = new BMW();
    b1.horn();


    Car cb2 = new BMW();
   //Car cb3 = new Mercedes();
    Car[] cars = {new BMW() };

        for (Car car:cars) {
car.getDoors();
        }

        System.out.println("C1 doors: "+c1.getDoors());
        c1.addPassenger();
        c1.addPassenger();
        c1.addPassenger();
        c1.addPassenger();
        c1.addPassenger();

        c1.addPassenger();

        System.out.println("B1 doors: "+b1.getDoors());
        b1.addPassenger();
        b1.addPassenger();
        b1.addPassenger();
        b1.addPassenger();
        b1.addPassenger();
        b1.carType();

        System.out.println("CB doors: "+cb2.getDoors());
        cb2.addPassenger();
        cb2.addPassenger();
        cb2.addPassenger();
        cb2.addPassenger();
        cb2.addPassenger();
        cb2.addPassenger();

        BMW cx = (BMW)cb2;
        cx.carType();
    }
}
