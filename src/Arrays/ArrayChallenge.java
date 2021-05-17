package Arrays;

import java.util.*;

public class ArrayChallenge {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //int[] array = getIntegers();
        //printArray(array);
        //System.out.println();
        int[] array = {106,82,5,26,15};
        printArray(sortArray(array,true));
        printArray(sortArray(array,false));

    }

    // method to read from keyboard into a array
    public static int[] getIntegers(int numbers) {
        int[] myArray = new int[numbers];
        System.out.println("Enter 5 integer values");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }
        return myArray;
    }
    // method to print a array
    public static void printArray(int[] myArray) {
        for (int element : myArray) {
            System.out.println(element);
        }
    }

    // method to sort array using build in functions
//        public static void sortArray(int[] array) {
//            Arrays.sort(array);
//            printArray(array);
//        }
    // method to sort using custom build
    public static int[] sortArray(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int n = 0; n < myArray.length - 1; n++) {
                if(myArray[n] > myArray[n + 1]) {
                    temp = myArray[n];
                    myArray[n] = myArray[n + 1];
                    myArray[n+1] = temp;
                }
            }
        }
        return myArray;
    }

    public static int[] sortArray(int[] myArray, boolean reverse) {
        if (reverse) {
            return sortArrayReverse(myArray);
        } else {
            return sortArray(myArray);
        }
    }

    private static int[] sortArrayReverse(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] < myArray[j + 1]) {
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        return myArray;
    }

}
