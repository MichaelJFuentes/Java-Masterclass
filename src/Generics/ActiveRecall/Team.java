package Generics.ActiveRecall;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player> implements Comparable{
    private String teamName;
    private List<T> teamMembers;
    private int wins;
    private int losses;
    private int draws;
    private int gamesPlayed;

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamMembers = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<T> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<T> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public boolean addPlayer(T player) {
        if (this.teamMembers.contains(player)) {
            System.out.println(player.getName() + " is already on team");
            return false;
        } else {
            System.out.println(player.getName() + " was added to team");
            this.teamMembers.add(player);
            return true;
        }
    }

    public boolean removePlayer(T player) {
        if (this.teamMembers.contains(player)) {
            System.out.println(player.getName() + " was removed from team");
            this.teamMembers.remove(player);
            return true;
        } else {
            System.out.println(player.getName() + " is not on the team");
            return false;
        }
    }

    public void printTeamMembers() {
        for (T player :
                this.teamMembers) {
            System.out.println(player.getName());
        }
    }

    public void playMatch(Team<T> opponent, int ourScore, int theirScore) {
        gamesPlayed++;
        if (ourScore > theirScore) {
            this.wins++;
            //System.out.println(this.teamName + " won against " + opponent.getTeamName());
        } else if (ourScore < theirScore) {
            this.losses++;
            //System.out.println(this.teamName + " loss against " + opponent.getTeamName());
        } else {
            this.draws++;
            //System.out.println(this.teamName + " drew against " + opponent.getTeamName());
        }

        if (opponent != null) {
            opponent.playMatch(null, theirScore, ourScore);

        }
    }

    public double ranking() {
        return this.wins;
    }

    public void printStats() {
        System.out.println(this.getTeamName());
        System.out.println("Wins: " + this.wins + "\n" +
                "Losses: " + this.losses + "\n" +
                "Tied: " + this.draws + "\n" +
                "Games Played " + this.gamesPlayed );
    }

    // add a comparable method

//    @Override
//    public int compareTo(Object team) {
//        int ranking = this.ranking();
//
//        if (ranking > 0) {
//            return 1;
//        } else if (ranking == 0) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    @Override
    public int compareTo(Object team) {
        int ranking = (int)this.ranking();
        //System.out.println(ranking);
        if (ranking > 0) {
            return 1;
        } else if (ranking < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
