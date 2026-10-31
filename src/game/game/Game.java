package game.game;

import game.character.player.Player;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player;

    public static boolean isRunning;
    //Metod för att få input i konsolen
    public static int readInt(String prompt, int useChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Felaktigt inmatning värde... Försök igen med en siffra...");
            }
        } while (input < 1 || input > useChoices);
        return input;
    }

    //Metod för att cleara terminal fönstret
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }
    //Metod för att gör en seperator med längd n

    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //metod för att printa header
    public static void printHeading(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    //Metod för att stoppa spelet tills användare lägger in någonting
    public static void anythingToContinue() {
        System.out.println("\nSkriv något för att fortsätta");
        scanner.next();
    }

    //Metod för att starta spelet
    public static void startGame() {
        boolean nameSet = false;
        String name;
        //Skriv ut titel
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println("Drakarnas Värld");
        System.out.println("Ett spel av Johannes Svensson");
        printSeperator(30);
        printSeperator(40);
        anythingToContinue();

        //Spelarens namn input
        do {
            clearConsole();
            printHeading("Vad är ditt namn?");
            name = scanner.next();
            //Frågar om spelaren är nöjd eller vill ändra
            clearConsole();
            printHeading("Ditt namn är " + name + ". \nÄr detta korrekt?");
            System.out.println("(1). Ja!");
            System.out.println("(2. Nej, Jag vill ändra mitt namn.");
            int input = readInt("-> ", 2);
            if (input == 1)
                nameSet = true;
        } while (!nameSet);

        //Skapar en ny spelare med namnet
        player = new Player(name);
        isRunning = true;

        gameLoop();
    }
    //Metod för att fortsätta resan
    public static void continueJourney(){

    }
    public static void characterInfo(){
        clearConsole();
        printHeading("KARAKTÄRS INFORMATION");
        System.out.println(player.getName() + "\tHP: " + player.getHp() + "/" + player.getMaxHP());
        printSeperator(20);
        System.out.println("XP: " + player.getXp());
        //Skriver ut valda skills
        if (player.numAtkUpgrades > 0){
            System.out.println("Offensiva skills: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
            printSeperator(20);}
        if (player.numDefUpgrades > 0){
            System.out.println("Defensiva skills: " + player.defUpgrades[player.numDefUpgrades - 1]);
            printSeperator(20);
        }
        anythingToContinue();
    }

    //Metod som skriver ut mainmenu
    public static void printMenu(){
        clearConsole();
        printHeading("MENU");
        System.out.println("Välj ett val: ");
        printSeperator(20);
        System.out.println("(1) Fortsätt din resa");
        System.out.println("(2) Karaktärs information");
        System.out.println("(3) Stäng av spelet");

    }

    //Main gameloop
    public static void gameLoop (){
        while(isRunning) {
            printMenu();
            int input = readInt("-> ", 3);
            if (input == 1) {
                continueJourney();
            } else if (input == 2)
                characterInfo();
            else isRunning = false;
            }
        }
    }








