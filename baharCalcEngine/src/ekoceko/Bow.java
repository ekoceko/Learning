package ekoceko;

public class Bow implements Ranged {
    public Bow(String name){
        setName(name);
    }
    public Bow(){}
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int fire() {
        return 5;
    }

    @Override
    public void sound() {
        System.out.println("I am a bow!");
    }

    @Override
    public void pickup() {
        System.out.println("Picked up bow: "+getName());

    }
    @Override
    public void drop() {
        System.out.println("Dropped bow");

    }
}
