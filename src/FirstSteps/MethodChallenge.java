package FirstSteps;

public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("mike", 1000);
        displayHighScorePosition("bob", 900);
        displayHighScorePosition("mary", 400);
        displayHighScorePosition("guy", 50);
        displayHighScorePosition("error", -23);

    }


    public static void displayHighScorePosition(String name, int score) {
        System.out.println(name + " managed to get into position " + calculateHighScorePosition(score) + " on the high score table");

    }


    public static int calculateHighScorePosition(int score) {
        int position = -1;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else if (score > 0) {
            position = 4;
        }
        return position;

    }

}