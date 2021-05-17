package RandomThings.JavaTwo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10,2,5,1,3,7,8,9,6};
        printArray(array);
        bubble(array);
        printArray(array);
    }

    public static void bubble(int[] ints) {
        int iterations = 0;
        int moves = 0;
        int endPoint = ints.length - 1;
        for (int i = 0; i < ints.length - 1; i++) {
            for (int h = 0; h < endPoint; h++) {
                if (ints[h] > ints[h + 1]) {
                    int temp = ints[h + 1];
                    ints[h + 1] = ints[h];
                    ints[h] = temp;
                }
                iterations++;
                moves++;
            }
            endPoint-- ;
            System.out.println(moves);
            moves = 0;
        }
        System.out.println(iterations);
    }

    public static void printArray(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println();
    }
}
