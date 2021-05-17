package FlowControl;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.lang.reflect.Array;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 0 ) {
            return -1;
        }
        int highest = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                highest = i;
                i--;
            }
        }
        return highest;
    }
}
