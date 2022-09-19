/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Additional modifications by A. Burgos 2022
 */

package Module_2.SportsTeamApp;

public class Team {
    private String teamName;
    private String[] players = new String [20];
    private int playerCount;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(String player) {
        players [playerCount] = player;
        playerCount++;
    }

    public String[] getPlayers() {
        return players;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public String getTeamName() {
        return teamName;
    }
}