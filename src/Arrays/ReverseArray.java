package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void reverse(int[] myArray) {
        int temp;
        int counter = myArray.length - 1;
        for (int i = 0; i < counter; i++) {
            temp = myArray[i];
            myArray[i] = myArray[counter];
            myArray[counter--] = temp;
        }
    }
}
