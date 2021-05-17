package Algo;

public class StringReversal {
    public static void main(String[] args) {
        String in = "Hello";
        System.out.println(methodOne(in));
        System.out.println(methodTwo(in));
        System.out.println(numberReversal(12345));
        System.out.println(numberSize(12345));
        System.out.println(isPalidrome("racecar"));
        printStairs(5);
        printUpdated(5);
    }
    public static String methodOne(String in) {
        StringBuilder stringOut = new StringBuilder();
        for (int i = in.length() - 1; i >= 0 ; i--) {
            stringOut.append(in.charAt(i));
        }
        return stringOut.toString();
    }

    public static String methodTwo(String in) {
        String out = "";
        for (int i = in.length() - 1; i >= 0 ; i--) {
            out += in.charAt(i);
        }
        return out;
    }

    public static int numberReversal(int inNumber) {
        int outNumber = 0;
        int decimalCounter = 10;
        int n = 4;
        while (inNumber % 10 > 0) {
            int digit = inNumber % 10;
            int add = (int) (digit * Math.pow(10, n--));
            outNumber += add;
            inNumber /= 10;
        }
        return outNumber;
    }

    // get the size of int
    public static int numberSize(int number) {
        int size = 0;
        while (number % 10  > 0) {
            size++;
            number /= 10;
        }
        return size;
    }

    public static boolean isPalidrome(String inString) {
        int start = 0;
        int end = inString.length() -1;
        while (start < end) {
            if (!(inString.charAt(start++) == inString.charAt(end--))) {
                return false;
            }
        }
        return true;
    }

    public static void printStairs(int height) {
        int numberOfColumnsInRow = height;
        int columnsInCurrentRow = 1;
        while (columnsInCurrentRow <= height) {
            String hashes = "";
            for (int i = 0; i < columnsInCurrentRow; i++) {
                hashes += "#";
            }
            String spaces = "";
            for (int i = 0; i < height - columnsInCurrentRow; i++) {
                spaces += " ";
            }
            System.out.printf("%s%s%s%s\n", spaces, hashes, hashes, spaces);
            columnsInCurrentRow++;
        }
    }

    public static void printUpdated(int height) {
        for (int i = 1; i <= height; i++) {
            // print spaces
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            // print hashes
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < height - i * 2; j++) {
                System.out.print(" ");
            }
            // print new line
            System.out.println();
        }
    }

}
