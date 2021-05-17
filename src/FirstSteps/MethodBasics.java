package FirstSteps;

public class MethodBasics {
    public static void main(String[] args) {
        calculateScore(800,5,100);
    }

    public static void calculateScore(int score, int level, int bonus) {
        int finalScore = score + (level * bonus);
        finalScore += 1000;
        System.out.println("Your final Score " + finalScore);
    }
}
