package Vending_machine.util;

public class CommandConverter {
    public static Command convert(String userInput) {
        String[] input = userInput.split(":");
        Command command= new Command();
        command.setKey(input[0]);
        command.setCol(Integer.parseInt(input[1])-1);
        command.setQuantity(Integer.parseInt(input[2]));
        return command;
    }


}
