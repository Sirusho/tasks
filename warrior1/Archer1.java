package warrior1;

public class Archer extends Warrior implements Shield{
    //10-30
    int max=30;
    int min=10;
    int max1=22;
    int min1=12;
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
        int res=super.takeDamage(damage)+defense();
        if(res<=0) {
            System.out.println("Archer is dead");
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

