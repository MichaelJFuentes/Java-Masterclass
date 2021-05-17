package FlowControl;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        boolean isInt;
        int number;
        int sum = 0;
        do {
            System.out.print("Enter number #" + counter + ": ");
            counter++;
            isInt = scanner.hasNextInt();
            if (isInt) {
                number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        } while (counter < 11);
        scanner.close();
        System.out.println(sum);
    }

}
