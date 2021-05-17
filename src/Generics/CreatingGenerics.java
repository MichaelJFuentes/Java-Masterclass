package Generics;

public class CreatingGenerics {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> texan = new Team("Texas");
        texan.addPlayer(joe);

        Team<FootballPlayer> bills = new Team("Bills");
        bills.addPlayer(new FootballPlayer("Tom"));

        Team<FootballPlayer> jets = new Team("Jets");

        Team<BaseballPlayer> yankees = new Team("yankees");

        Team<FootballPlayer> dallas = new Team<>("Dallas");

        dallas.matchResult(jets,34,2);
        dallas.matchResult(texan,23,3);
        dallas.matchResult(bills,5,2);
//        texan.addPlayer(pat);
//        texan.addPlayer(beckham);

        //yankees.matchResult(texan,1,0);
        texan.matchResult(bills,37,32);
        texan.matchResult(jets, 20,12);
        jets.matchResult(bills, 23,12);


        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>();
        footballLeague.addTeam(texan);
        footballLeague.addTeam(jets);
        footballLeague.addTeam(bills);
        footballLeague.addTeam(dallas);

        //footballLeague.addTeam(yankees);

        footballLeague.printLeagueRankings();



    }
}
