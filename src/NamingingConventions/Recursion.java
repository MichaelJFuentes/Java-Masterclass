package NamingingConventions;

public class Recursion {
    public static int counter = 0;
    public static void main(String[] args) {
        //printHello(10);
        //System.out.println(factorial(4));
        System.out.println(digitsInNumberFor(12345));
        System.out.println(sumOfDigitsRecursion(12345));
        System.out.println(sum(6));
    }

    public static void printHello(int n) {
        if (n > 0) {
            System.out.println("Hello " + n);
            n--;
            printHello(n);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(--n);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 ) {
            return 1;
        } else {
            return fibonacci(n - 1) + (n - 2);
        }
    }

    public static int digitsInNumberFor(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        //total += number;
        return total;
    }

    public static int sumOfDigitsRecursion(int number) {
        if (number > 0 ) {
            return number % 10 + sumOfDigitsRecursion(number / 10);
        } else {
            return number;
        }
    }

    public static int sum(int n) {
        if (n > 0) {
            return n + sum(--n);
        } else {
            return n;
        }
    }
}
