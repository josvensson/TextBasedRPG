package game.character;

public abstract class Character {
    private String name;
    private int maxHP;
    private int level;
    private double xp;

    public Character() {
    }

    public Character(String name, int maxHP, int level, double xp) {
        this.name = name;
        this.maxHP = maxHP;
        this.level = level;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getLevel() {
        return level;
    }

    public double getXp() {
        return xp;
    }

    public int attack() {
        return 0;
    }

    public int defend() {
        return 0;
    }

}

