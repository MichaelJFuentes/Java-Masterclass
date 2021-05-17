package FlowControl;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average;
        int counter = 0;
        int tempNumber;
        while (true) {
            if (scanner.hasNextInt()) {
                tempNumber = scanner.nextInt();
                counter++;
                sum += tempNumber;
                scanner.nextLine();
            } else {
                break;
            }
        }
        scanner.close();
        if (counter == 0) {
            average = 0;
        } else {
            //long avg = Math.round((double)(sum / counter));
            double avg = Math.round((double)sum / counter);
            average = (int)avg;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
