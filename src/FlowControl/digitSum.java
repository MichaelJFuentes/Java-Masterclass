package FlowControl;

public class digitSum {
    public static void main(String[] args) {
        for (int i = -2; i < 135; i++) {
            System.out.println("i value " + i + ": " + sumDigits(i));
        }
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        int counter = 8;
        do {
            sum += (int)(number / Math.pow(10, counter));
            number %= Math.pow(10, counter);
            counter--;
            if (counter < 0) {
                break;
            }
        } while (number > 9);
        sum += number;
        return sum;
    }

}
