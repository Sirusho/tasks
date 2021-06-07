package warrior;

import java.util.Random;

public class Swordsman extends Warrior implements Shield {
    private int damage;
    int max = 35;
    int min = 25;
    int max1 = 20;
    int min1 = 10;

    public Swordsman() {
    }

    @Override
    public String toString() {
        return "Swordsman";
    }

    @Override
    int attack() {
        int res = (int) ((Math.random() * (max - min)) + min);
        System.out.println("attack power is " + res);
        return res;
    }

    @Override
    public int takeDamage(int damage) {
        int res = super.takeDamage(damage);
        if (res <= 0) {
            System.out.println("Swordsman is dead");
        }
        return res;
    }

    @Override
    public int defense() {
        int res = (int) ((Math.random() * (max1 - min1)) + min1);
        System.out.println("defense power is " + res);
        return res;
    }
}
