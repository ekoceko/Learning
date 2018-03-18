package eko.cars;

public class Car {
    private int doors = 4;
    private int passengers = 0;
    private int maxpassengers = 5;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMaxpassengers() {
        return maxpassengers;
    }

    public void setMaxpassengers(int maxpassengers) {
        this.maxpassengers = maxpassengers;
    }



    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public void addPassenger(){
        if (hasSpace()){
            passengers += 1;
            System.out.println("passenger number is: "+ passengers);
        }
        else {
            System.out.println("No space in car");
        }

    }

    private boolean hasSpace(){

        return passengers < getMaxpassengers();
    }

    public void horn(){
        System.out.println("Car HORN");
    }
}
