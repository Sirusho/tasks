package warrior;

public class Dice {
    void displayDice(int diceNumber) {
        String arr[][] = new String[3][3];
        switch (diceNumber) {
            case 1:
                arr[diceNumber][diceNumber] = ".";
                break;
            case 2:
                arr[0][2] = ".";
                arr[2][0] = ".";
                break;
            case 3:
                arr[0][0] = ".";
                arr[1][1] = ".";
                arr[2][2] = ".";
                break;
            case 4:
                arr[0][0] = ".";
                arr[0][2] = ".";
                arr[2][0] = ".";
                arr[2][2] = ".";
                break;
            case 5:
                arr[0][0] = ".";
                arr[1][1] = ".";
                arr[2][2] = ".";
                arr[2][0] = ".";
                arr[0][2] = ".";
                break;
            case 6:
                arr[0][0] = ".";
                arr[0][1] = ".";
                arr[0][2] = ".";
                arr[2][0] = ".";
                arr[2][1] = ".";
                arr[2][2] = ".";
                break;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == null) {
                    arr[i][j] = " ";
                }
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}


