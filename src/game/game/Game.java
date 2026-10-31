package game.game;

import game.character.player.Player;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player;

    public static boolean isRunning;
    //Random möten
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};

    //Fiende namn
    public static String[] enemies = {"Skugg Troll", "Skugg Troll", "Mörkrets häxa", "Skugg spindel", "Skugg spindel"};

    //Story element
    public static int place = 0, act = 1;
    public static String[] places = {"Den tysta skogen", "De övergivna byarna", "Älven och fjällen", "Kebnekaises topp"};

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
        System.out.println("Den Stora Tystnaden");
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

        Story.printIntro();

        //Skapar en ny spelare med namnet
        player = new Player(name);

        //print första story
        Story.printFirstActIntro();
        isRunning = true;

        gameLoop();
    }

    public static void checkAct() {
        //Byter act baserad på xp
        if (player.getXp() >= 10 && act == 1) {
            act = 2;
            place = 1;
            Story.printFirstActOutro();
            //Låt spelaren levla upp
            player.chooseTrait();
            //story
            Story.printSecondActIntro();
            //Ny värden för fiender
            enemies[0] = "Skugg troll";
            enemies[1] = "Mörkrets häxa";
            enemies[2] = "Varg flock";
            enemies[3] = "Förtrollad Skogshuggare";
            enemies[4] = "Cat in a hat";
            // Ge värden till encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Shop";
            //Ge fullt hp
            //player.getHp() = player.getMaxHP();
        } else if (player.getXp() >= 50 && act == 2) {
            act = 3;
            place = 2;
            Story.printSecondActOutro();
            //LVL UP
            player.chooseTrait();
            Story.printThirdActIntro();
            //Ny värden för fiender
            enemies[0] = "Mörkrets Clown";
            enemies[1] = "Gastar";
            enemies[2] = "Mörkrets Clown";
            enemies[3] = "Hemsökt flicka";
            enemies[4] = "Skogs Troll";
            // Ge värden till encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Battle";
            encounters[4] = "Shop";
            // heal
          //  player.getHp() = player.getMaxHP();
        } else if (player.getXp() >= 100 && act == 3) {
            act = 4;
            place = 3;
            Story.printThirdActOutro();
            //lvl up
            player.chooseTrait();
            Story.printFourthActIntro();
            // heal up
           // player.getHp() = player.getMaxHP();
            //Finalbattle


        }
    }

    public static void randomEncounter() {
        int encounter = (int) (Math.random() * encounters.length);
        //Kallar på respektivte metoder
        if (encounters[encounter].equals("Battle")) {
            //Random battle
        } else if (encounters[encounter].equals("Rest")) {
            //Vila
        } else {
//shop
        }    //shop();

    }

    //Metod för att fortsätta resan
    public static void continueJourney() {
        //Checka ifall act måste öka
        checkAct();
        //Checka om spelet inte är i förra acten
        if (act != 4)
            randomEncounter();

    }

    public static void characterInfo() {
        clearConsole();
        printHeading("KARAKTÄRS INFORMATION");
        System.out.println(player.getName() + "\tHP: " + player.getHp() + "/" + player.getMaxHP());
        printSeperator(20);
        System.out.println("XP: " + player.getXp());
        printSeperator(20);
        //Skriver ut valda skills
        if (player.numAtkUpgrades > 0) {
            System.out.println("Offensiva skills: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
            printSeperator(20);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defensiva skills: " + player.defUpgrades[player.numDefUpgrades - 1]);
            printSeperator(20);
        }
        anythingToContinue();
    }

    //Metod som skriver ut mainmenu
    public static void printMenu() {
        clearConsole();
        printHeading(places[place]);
        System.out.println("Välj ett val: ");
        printSeperator(20);
        System.out.println("(1) Fortsätt din resa");
        System.out.println("(2) Karaktärs information");
        System.out.println("(3) Stäng av spelet");

    }

    //Main gameloop
    public static void gameLoop() {
        while (isRunning) {
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








