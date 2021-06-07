package coffee_machine;

public class NoSuchDrinkException extends RuntimeException {
   public static void message(){
       System.out.println("No Such Drink, please input valid drink type");
    }
}
