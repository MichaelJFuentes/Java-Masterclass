package FirstSteps.TeenNumberChecker;

public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        boolean hasTeen = false;
        int[] myArray = {number1, number2, number3};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 13 && myArray[i] <= 19) {
                hasTeen = true;
            }
        }
        return hasTeen;
    }

    public static boolean isTeen(int age) {
        boolean booStatus = false;
        if (age >= 13 && age <= 19) {
            booStatus = true;
        }
        return booStatus;
    }
}
