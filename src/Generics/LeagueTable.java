package Generics;

import java.util.*;
import java.util.Collections;

public class LeagueTable <T extends Team> {
    private ArrayList<T> leagueTeams;


    public LeagueTable() {
        this.leagueTeams = new ArrayList<>();
    }

    public List<T> getLeagueTeams() {
        return leagueTeams;
    }

    public void printTeams() {
        for (T t :
                this.leagueTeams) {
            System.out.println(t.getTeamName());
        }
    }

    // add team
    public boolean addTeam(T teamToAdd) {
        if (this.leagueTeams.contains(teamToAdd)) {
            System.out.println(teamToAdd.getTeamName() + " is already in the league");
            return false;
        } else {
            this.leagueTeams.add(teamToAdd);
            System.out.println(teamToAdd.getTeamName() + " was added to the league");
            return true;
        }
    }

    // print the teams in order
    public void printLeagueRankings() {
        Collections.sort(this.leagueTeams,Collections.reverseOrder());
        //Collections.reverse(this.leagueTeams);
        System.out.println("Rankings");
        for (T t :
                this.leagueTeams) {
            System.out.println(t.getTeamName() + " -> " + t.ranking());
        }
    }

    // print league players 
//    public void printLeagueRankings() {
//        ArrayList<Rank> rankArrayList = new ArrayList<>();
//        for (int i = 0; i < this.leagueTeams.size(); i++) {
//            Team tempTeam = ((Team) this.leagueTeams.get(i));
//
//            Rank rank = new Rank(tempTeam.getTeamName(), tempTeam.ranking());
//            rankArrayList.add(rank);
//        }
//
//        // sort array based on ranking
//        Collections.sort(rankArrayList);
//    }

}


