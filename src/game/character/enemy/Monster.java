package game.character.enemy;

import game.character.Character;

public class Monster extends Character {
    //Variable för att lagra spelarens nuvarande XP
    int playerXp;

    public Monster(String name, int maxHP, int xp, int playerXp) {
        super(name, (int) (Math.random()*playerXp + playerXp/3 + 5), (int) (Math.random()*(playerXp/4 + 2) +1));
        this.playerXp = playerXp;
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public int defend() {
        return super.defend();
    }
}
