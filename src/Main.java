import game.game.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game.printHeading("Testing helper method");
        Game.anythingToContinue();
        Game.clearConsole();
        int input = Game.readInt("Skriv 1, 2 eller 3: ", 3);
        System.out.println("Du valde nummer " + input);

    }

}

