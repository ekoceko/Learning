package ekoceko;

public class Sword implements Melee {
    public Sword(String name) {
        setName(name);
    }

    @Override
    public int hit() {
        return 0;
    }

    @Override
    public void sound() {

    }
}
