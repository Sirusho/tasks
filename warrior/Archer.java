package warrior;

import java.util.Random;

public class Archer extends Warrior {
    //10-30
    int max=30;
    int min=10;
    @Override
    int attack() {
        int res=(int)((Math.random() * (max - min)) + min);
        System.out.println("attack power is " + res);
        return res;
    }

    @Override
    public String toString() {
        return "Archer";
    }

    @Override
    public int takeDamage(int damage) {
        int res=super.takeDamage(damage);
        if(res<=0) {
            System.out.println("Archer is dead");
        }
        return res;
    }
}
