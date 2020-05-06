package ekoceko;

public class Weapon implements Comparable<Weapon> {
    private String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void pickup(){

    }
    void drop(){

    }

    @Override
    public int compareTo(Weapon w) {
        return 0;
    }
}
