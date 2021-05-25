package coffee_machine;

import coffee_machine.models.*;
import coffee_machine.util.Command;

public class CoffeeMachine {

     public Cup makeProduct(Command command){
         Cup cup = new Cup();
         DrinkType drinkType = command.getDrinkType();
         resolveDrink(cup, drinkType);
         resolveStick(command, cup);
         resolveSugars(command, cup);

         return cup;

     }

    private void resolveSugars(Command command, Cup cup) {
        Sugar[] sugars=new Sugar[command.getSugarQuantity()];
        for (int i=0; i<sugars.length; i++) {
            sugars[i]=new Sugar();
        }
        cup.setSugars(sugars);
    }

    private void resolveStick(Command command, Cup cup) {
        if(command.getSugarQuantity()>0){
            cup.setStick(new Stick());
        }
    }

    private void resolveDrink(Cup cup, DrinkType drinkType) {
        if(drinkType==DrinkType.TEA){
           cup.setDrink(new Tea());
        }else if(drinkType==DrinkType.COFFEE) {
            cup.setDrink(new Coffee());
        }else if(drinkType==DrinkType.CHOCOLATE) {
            cup.setDrink(new Chocolate());
        }
    }
}
