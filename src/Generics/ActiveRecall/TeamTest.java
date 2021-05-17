package Generics.ActiveRecall;

public class TeamTest {
    public static void main(String[] args) {
        Player Watson = new FootBallPlayer("Watson");
        FootBallPlayer JJ = new FootBallPlayer("JJ");

        BasketBall Lebron = new BasketBall("Lebron");
        BasketBall MJ = new BasketBall("MJ");

        Team<BasketBall> lakers = new Team<BasketBall>("Lakers");
        lakers.addPlayer(Lebron);
        lakers.addPlayer(MJ);

        FootBallPlayer prescot = new FootBallPlayer("Prescot");
        FootBallPlayer dax = new FootBallPlayer("Dax");


        Team<FootBallPlayer> houston = new Team<>("Houston");
        houston.addPlayer(JJ);
        houston.addPlayer((FootBallPlayer) Watson);

        Team<FootBallPlayer> dallas = new Team<>("Dallas");
        dallas.addPlayer(prescot);
        dallas.addPlayer(dax);

        houston.printTeamMembers();
        dallas.printTeamMembers();

        houston.playMatch(dallas, 34,23);

        houston.printStats();
        System.out.println();
        dallas.printStats();

        houston.playMatch(dallas, 34,24);

        houston.printStats();

        //league test
        //League<Team<FootBallPlayer>> footballleague = new League<>("NFL");
        League<Team<FootBallPlayer>> footballLeage = new League<>("NFL");

        footballLeage.addTeam(houston);
        footballLeage.addTeam(dallas);
//        footballLeage.printTeams();
//        footballLeage.removeTeam(dallas);
//        footballLeage.printTeams();


        footballLeage.printRank();
        System.out.println();
        //dallas.playMatch(houston,23,3);

//        dallas.printStats();
//        houston.printStats();
        dallas.playMatch(houston,32,12);

        footballLeage.printRank();

        lakers.printTeamMembers();

    }
}
