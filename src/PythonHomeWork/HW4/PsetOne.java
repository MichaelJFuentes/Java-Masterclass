package PythonHomeWork.HW4;

import java.util.Scanner;

public class PsetOne {
    // check is number is a square

    // check if number is positive

    // calcluate the total of digits in number
    public static int digitSum(int number) {
        int digitTotal = 0;
        int digit = number % 10;
        while (digit > 0) {
            digitTotal += digit;
            number /= 10;
            digit = number % 10;
        }
        return digitTotal;
    }
    // calculate the average out 4 numbers entered
    public static double averageOfFour() {
        double total = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i + 1) + ": " );
            total += scanner.nextInt();
        }
        return total / 4;
    }
    // calculate the parking cost

    // calculate the monthlyPayment

    // calcluate the average calories over a week

    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }
}
