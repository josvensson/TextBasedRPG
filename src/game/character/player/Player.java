package game.character.player;

import game.character.Character;
import game.game.Game;

public class Player extends Character {

    public int numAtkUpgrades;
    public int numDefUpgrades;

    public Player(String name) {
        super(name, 100, 100, 1, 0);
        //Setting # av uppgraderar till 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        chooseTrait();
    }

    public String[] atkUpgrades = {"Björnkraft", "Jättens vrede", "Runmagi", "Nattens klinga"};
    public String[] defUpgrades = {"Barkpansar", "Trollhud", "Norrskensskölden", "Dimmans slöja"};



    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public int defend() {
        return super.defend();
    }

    //Låt spelaren välja skill eller path
    public void chooseTrait() {
        Game.clearConsole();
        Game.printHeading("Välj en skill");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //Spelaren val
        int input = Game.readInt("-> ", 2);
        Game.clearConsole();
        //Båda fall
        if (input == 1) {
            Game.printHeading("Du valde " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        } else {
            Game.printHeading("Du valde " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        Game.anythingToContinue();


    }
}


