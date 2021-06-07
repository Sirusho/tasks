package warrior;

public class Mage extends Warrior implements Shield{
    int max=40;
    int min=20;
    int max1=18;
    int min1=8;
    @Override
    int attack() {
        int res=(int)((Math.random() * (max - min)) + min);
        System.out.println("attack power is " + res);
        return res;
    }
    @Override
    public int defense() {
        int res = (int) ((Math.random() * (max1 - min1)) + min1);
        System.out.println("defense power is " + res);
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
