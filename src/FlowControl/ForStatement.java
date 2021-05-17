package FlowControl;

public class ForStatement {
    public static void main(String[] args) {
        double amount = 10000;
        for (int i = 8; i > 1; i--) {
            System.out.println(amount + " at " + (i) + "% interest is: " + String.format("%.2f",calculateInterest(amount, (double)i)));
        }
        int primeNumberCounter = 0;

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                primeNumberCounter++;
                System.out.println(i + " is a prime number");
                if (primeNumberCounter >= 3) {
                    break;
                }
            }

        }
        System.out.println("break occured at " + primeNumberCounter + " numbers");
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
