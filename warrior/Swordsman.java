package warrior;

public class Swordsman extends Warrior {
    private int damage;
    int max=50;
    int min=25;

    public Swordsman() {
    }

    @Override
    public String toString() {
        return "Swordsman";
    }

    @Override
    int attack() {
        int res=(int)((Math.random() * (max - min)) + min);
        System.out.println("attack power is " + res);
        return res;
    }
    @Override
    public int takeDamage(int damage) {
        int res=super.takeDamage(damage);
        if(res<=0) {
            System.out.println("Swordsman is dead");
        }
        return res;
    }

}
