package Vending_machine;

import Vending_machine.util.Command;
import Vending_machine.util.CommandConverter;
import serialization.Person;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want?");
        String input = scanner.nextLine();
        Command command = CommandConverter.convert(input);
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("1");
        try (FileInputStream fileInputStream = new FileInputStream("vendingMachine.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            vendingMachine = (VendingMachine) objectInputStream.readObject();
            System.out.println("2");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        vendingMachine.start(command);
        System.out.println("4");
        FileOutputStream file = new FileOutputStream("vendingMachine.txt");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(file)) {
            objectOutputStream.writeObject(vendingMachine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vendingMachine);
    }


}
