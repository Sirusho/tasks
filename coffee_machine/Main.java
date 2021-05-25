package coffee_machine;

import coffee_machine.models.Cup;
import coffee_machine.util.Command;
import coffee_machine.util.CommandConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = getString();
        Command command = CommandConverter.convert(input);

        CoffeeMachine coffeeMachine=new CoffeeMachine();
        Cup cup = coffeeMachine.makeProduct(command);
        System.out.println(cup);
    }

    private static String getString() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What do you want to drink ?");
        return scanner.nextLine();
    }
}
