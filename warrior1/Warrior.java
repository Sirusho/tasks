package warrior;

public abstract class Warrior {
    int health=100;

    abstract int attack();

     public int takeDamage(int damage){
      health-=damage;
         System.out.println("power left " + health);
         return health;
     }

    public Warrior() {
    }

    public Warrior(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
