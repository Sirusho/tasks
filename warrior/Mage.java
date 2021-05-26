package warrior;

public class Mage extends Warrior {
    int max=40;
    int min=20;
    @Override
    int attack() {
        int res=(int)((Math.random() * (max - min)) + min);
        System.out.println("attack power is " + res);
        return res;
    }

    @Override
    public String toString() {
        return "Mage";
    }

    @Override
    public int takeDamage(int damage) {
        int res=super.takeDamage(damage);
        if(res<=0) {
            System.out.println("Mage is dead");
        }
        return res;
    }

}
