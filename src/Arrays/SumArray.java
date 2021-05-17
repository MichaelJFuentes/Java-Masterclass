package Arrays;

import java.util.Scanner;

public class SumArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInts = getIntegers(5);
        printArray(myInts);
        System.out.println("The average is " + calculateAverage(myInts));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int element :
                array) {
            System.out.println(element);
        }
    }

    public static double calculateAverage(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return (double)total / (double)array.length;
    }
}
