package ekoceko;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args){
        List<Weapon> al = new ArrayList<>();
        Sword s1 = new Sword("Buzölüm");
        Sword s2 = new Sword("Parıltı");
        Bow r1 = new Bow("Betrayer");
        Bow r2 = new Bow("Taulmaril");

        Set<Weapon> set1 = new HashSet<>();
        HashSet<Weapon> set2 = new HashSet<>();

        al.add(s1);
        al.add(s2);
        al.add(r1);
        al.add(r2);

        for (Weapon w:al) {
            w.pickup();
        }
    }
}
