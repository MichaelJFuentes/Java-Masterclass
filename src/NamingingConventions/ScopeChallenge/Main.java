package NamingingConventions.ScopeChallenge;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
