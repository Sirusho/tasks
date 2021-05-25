package coffee_machine.models;

public class Cup {
    private Drink drink;
    private Stick stick;
    private Sugar[] sugars;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public Sugar[] getSugars() {
        return sugars;
    }

    public void setSugars(Sugar[] sugars) {
        this.sugars = sugars;
    }
}
