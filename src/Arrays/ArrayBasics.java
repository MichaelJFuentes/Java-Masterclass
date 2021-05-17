package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};
        for (int element : myIntArray) {
            System.out.println(element);
        }
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
    }
}
