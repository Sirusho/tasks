package coffee_machine;

public class Command {
    private int sugarQunatity;
    private DrinkType drinkType;

    public Command(int sugarQunatity, DrinkType drinkType) {
        this.sugarQunatity = sugarQunatity;
        this.drinkType = drinkType;
    }

    public Command() {
    }

    public int getSugarQunatity() {
        return sugarQunatity;
    }

    public void setSugarQunatity(int sugarQunatity) {
        this.sugarQunatity = sugarQunatity;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
    /* String input;

    public Command(String input) {
        this.input = input;
        switch (input.charAt(input.length()-1)){
            case '1':
                Sugar sugar1=new Sugar(1);
                break;
            case '2':
                Sugar sugar2=new Sugar(2);
                break;
            case '3':
                Sugar sugar3=new Sugar(3);
                break;
        }


        switch (input.charAt(0)){
            case 'T':
                System.out.println("Tea has been made");
                Cup cup2=new Cup();
                Tea tea=new Tea();
                cup2.setDrink(tea);
                break;
            case 'C':
                System.out.println("Coffee has been made");
                Cup cup=new Cup();
                Coffee coffee=new Coffee();
                cup.setDrink(coffee);
                break;
            case 'S':
                System.out.println("Chocolate has been made");
                Cup cup1=new Cup();
                Chocolate chocolate=new Chocolate();
                cup1.setDrink(chocolate);
                break;
            default:
                System.out.println("No such product");
        }
    }

    */
}
