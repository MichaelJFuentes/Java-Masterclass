package Generics;

import java.util.ArrayList;
import java.util.Collection;

public class Team <T extends Player> implements Comparable<Team<T>> {
    private String teamName;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("player " + player.getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName);
            return true;
        }
    }

    public int getWon() {
        return this.won;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int thierScore) {
        String msg;
        if (ourScore > thierScore) {
            msg = "won";
            won++;
        } else if(thierScore == ourScore) {
            msg = "tied";
            tied++;
        } else {
            msg = "lost";
            lost++;
        }
        played++;
        if (opponent != null) {
            System.out.println(this.teamName + " " + msg + " against " + opponent.getTeamName());
            opponent.matchResult(null, thierScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return 1;
        } else if (this.ranking() < team.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }
}
