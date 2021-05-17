package Generics.ActiveRecall;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    private ArrayList<T> teams;
    private String leagueName;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<T> teams) {
        this.teams = teams;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void printTeams() {
        for (T team :
                this.teams) {
            System.out.println(team.getTeamName());
        }
    }

    public boolean addTeam(T team) {
        if (team == null) {
            System.out.println("Team can not be null");
            return false;
        } else if (this.teams.contains(team)) { // could a set be used to avoid the duplicate values
            System.out.println("Team is already in league");
            return false;
        } else {
            this.teams.add(team);
            return true;
        }
    }

    public boolean removeTeam(T team) {
        if (this.teams.contains(team)) {
            System.out.println("Team removed");
            this.teams.remove(team);
            return true;
        } else if (team == null) {
            System.out.println("Can not remove null team");
            return false;
        } else {
            System.out.println(team.getTeamName() + " is not in the league");
            return false;
        }
    }

    public void printRank() {
        Collections.sort(this.teams,Collections.reverseOrder());
        for (T team :
                this.teams) {

            System.out.println(team.getTeamName() + " --> " + team.ranking() );
        }
    }
}
