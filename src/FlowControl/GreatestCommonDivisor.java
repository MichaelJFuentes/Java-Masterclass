package FlowControl;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n = getGreatestCommonDivisor(25,15);
        n = getGreatestCommonDivisor(12,30);
        n = getGreatestCommonDivisor(81,153);
        n = getGreatestCommonDivisor(12,36);
    }

    public static int getGreatestCommonDivisor(int n1, int n2) {
        // check if values are valid above 10
        if (n1 < 10 || n2 < 10) {
            return -1;
        }
        int largest;
        if (n1 > n2) {
            largest = n1;
        } else {
            largest = n2;
        }
        int greatestCommonDivisor = 0;
        for (int i = 1; i < largest ; i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
