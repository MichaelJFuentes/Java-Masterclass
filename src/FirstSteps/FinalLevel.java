package FirstSteps;

public class FinalLevel {
    public static void main(String[] args) {
        int score = 1000;
        int levelComplete = 8;
        int bonus = 200;
        boolean gameOver = true;
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

}
