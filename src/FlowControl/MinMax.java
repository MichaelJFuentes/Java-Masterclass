package FlowControl;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int tempNumber;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                tempNumber = scanner.nextInt();
                scanner.nextLine();
                if (tempNumber > max) {
                    max = tempNumber;
                }
                if (tempNumber < min) {
                    min = tempNumber;
                }
            } else {
                System.out.println("Breaking out of the loop");
                break;
            }
        }
        scanner.close();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
