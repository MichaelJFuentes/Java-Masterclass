package NamingingConventions.PackageChallenge;

public class StaticMethods {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(nSum(i));
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(factorial(i));
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(fabonacci(i));
//        }
//    }

    public static int nSum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int fabonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int nMinus1 = 1;
            int nMinus2 = 0;
            int fib = 0;
            for (int i = 0; i < n; i++) {
                fib = nMinus1 + nMinus2;
                nMinus2 = nMinus1;
                nMinus1 = fib;
            }
            return fib;
        }

    }
}
