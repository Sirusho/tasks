package warrior;

import java.util.Random;
import java.util.Scanner;

public class WarriorGame {
    void play() {
        String startRes = start();
        Warrior[] warriors = chooseHero(startRes);
        fight(warriors);


    }


    String start() {
        Random rand = new Random();
        String res = "you";
        while (true) {
            int myDice = rand.nextInt(6) + 1;
            int compDice = rand.nextInt(6) + 1;
            res = throwDice(myDice, compDice);
            if (myDice != compDice) {
                break;
            }
        }
        return res;
    }

    Warrior[] chooseHero(String string) {
        int myIndex = 1;
        Warrior[] warriors = new Warrior[2];
        if (string.equalsIgnoreCase("you")) {
            myIndex = 0;
        }
        System.out.println("Choose your character \n Swordsman--1  \n  Archer--2 \n  Mage--3");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        warriors[myIndex] = generateHero(input);
        Random random = new Random();
        int computerNumber = random.nextInt(3) + 1;
        warriors[(myIndex + 1) % 2] = generateHero(computerNumber);
        return warriors;
    }

    void fight(Warrior[] w) {
        int round = 0;

        while (true) {
            System.out.println("Round " + round + " Player " +(round % 2) + " is attacking" );
            w[(round + 1) % 2].takeDamage(w[round % 2].attack());
            if (w[(round + 1) % 2].getHealth() <= 0) {
                System.out.println("Game over for" + w[(round + 1) % 2]);
                break;
            } else {
                round++;
            }
        }
    }

    Warrior generateHero(int num) {
        Warrior warrior;
        switch (num) {
            case 1:
                warrior = new Swordsman();
                System.out.println("Swordsman is chosen");
                break;
            case 2:
                warrior = new Archer();
                System.out.println("Archer is chosen");
                break;
            case 3:
                warrior = new Mage();
                System.out.println("Mage is chosen");
                break;
            default:
                return null;
        }
        return warrior;

    }

    static String throwDice(int num1, int num2) {
        String result = "";
        Dice dice = new Dice();
        dice.displayDice(num1);
        dice.displayDice(num2);
        if (num1 > num2) {
            System.out.println("You start");

            result += "you";
        } else if (num1 < num2) {
            System.out.println("Computer starts");
        }
        return result;
    }
}
