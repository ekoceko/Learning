package eko.cars;

public class BMW extends Car{
    private int doors = 2;
    private int passengers = 0;

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int getMaxpassengers() {
        return maxpassengers;
    }

    @Override
    public void setMaxpassengers(int maxpassengers) {
        this.maxpassengers = maxpassengers;
    }

    private int maxpassengers = 4;
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void carType(){
        System.out.println("My type is BMW, not Car");
    }
    public void horn(){
        super.horn();
        System.out.println("BMW HORN");
    }
}
