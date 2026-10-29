package game.character;

public class abstract Character {
    String name;
    int maxHP;
    int level;
    double xp;

    public Character() {
    }

    public Character(String name, int maxHP, int level, double xp) {
        this.name = name;
        this.maxHP = maxHP;
        this.level = level;
        this.xp = xp;
    }

    public int attack(){
        return 0;
    }

    public int defend(){
        return 0;
    }

}

