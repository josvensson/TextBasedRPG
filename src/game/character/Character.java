package game.character;

public abstract class Character {
    private String name;
    private int hp;
    private int maxHP;
    private int level;
    private int xp;

    public Character(String name, int maxHP, int xp) {
        this.name = name;
        this.maxHP = maxHP;
        this.xp = xp;
    }

    public Character(String name, int hp, int maxHP, int level, int xp) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.level = level;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public int getHp(){
        return hp;
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

