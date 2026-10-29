package game.player;

public class Player {
    String playerName;
    int playerHP;
    int playerMaxHP;
    int playerLevel;
    double playerXP;
    double playerAttackDMG;

    public Player() {
    }

    public Player(String playerName, int playerHP, int playerMaxHP, int playerLevel, double playerXP, double playerAttackDMG) {
        this.playerName = playerName;
        this.playerHP = playerHP;
        this.playerMaxHP = playerMaxHP;
        this.playerLevel = playerLevel;
        this.playerXP = playerXP;
        this.playerAttackDMG = playerAttackDMG;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public int getPlayerMaxHP() {
        return playerMaxHP;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public double getPlayerXP() {
        return playerXP;
    }

    public double getPlayerAttackDMG() {
        return playerAttackDMG;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
