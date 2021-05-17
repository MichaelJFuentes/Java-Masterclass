package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) {
        int x = getIntLBYL();
        System.out.println("x is " + x );
    }

    public static int getInt() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return keyboard.nextInt();
         // rewrite the above to handel non number
    }

    public static int getIntLBYL() {
        Scanner s = new Scanner(System.in   );
        boolean isValid = true;
        System.out.print("Please enter an integer: ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        } else {
            return 0;
        }
    }

    public static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            return s.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            return 0;
        }
    }
}
