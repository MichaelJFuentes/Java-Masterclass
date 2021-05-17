package Arrays;

import java.util.Scanner;

public class MinimumElementChallenge {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int count = keyboard.nextInt();
        int[] myArray = readIntegers(count);
        System.out.println(findMin(myArray));
        keyboard.close();

    }

    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number: ");
            myArray[i] = keyboard.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        return temp;
    }

}
