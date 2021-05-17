package FlowControl;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,10));
        System.out.println(sumOdd(-1, 30));
        System.out.println(sumOdd(2,-23));
        System.out.println(sumOdd(34,12));
        System.out.println(sumOdd(0, 100));
    }

    public static boolean isOdd(int n) {
        if (n < 0 ) {
            return false;
        }
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        // ensures end is larger than start. Numbers are larger than 0
        // otherwise return a flag value
        if (end < start || end < 0 || start < 0) {
            return -1;
        }
        int sum  = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                // add current loop value to running total
                sum += i;
            }
        }
        // return sum value after loop terminates
        return sum;
    }
}
