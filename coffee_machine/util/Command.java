package coffee_machine.util;

import coffee_machine.models.DrinkType;

public class Command {
    private int sugarQuantity;
    private DrinkType drinkType;

    public Command(int sugarQuantity, DrinkType drinkType) {
        this.sugarQuantity = sugarQuantity;
        this.drinkType = drinkType;
    }

    public Command() {
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

}
