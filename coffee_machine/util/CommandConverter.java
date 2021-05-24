package coffee_machine;

public class CommandConverter {
    public static Command convert(String input){

        Command command = new Command();
           String split[]=input.split(":");

        extractDrinkType(command, split);
        command.setSugarQunatity(Integer.parseInt(split[1]));
        return command;

    }

    private static void extractDrinkType(Command command, String[] split) {
        switch (split[0]) {
            case "T":
                command.setDrinkType(DrinkType.TEA);
                break;
            case "C":
                command.setDrinkType(DrinkType.COFFEE);
                break;
            case "S":
                command.setDrinkType(DrinkType.CHOCOLATE);
                break;
        }
    }
}
