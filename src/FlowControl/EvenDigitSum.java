package FlowControl;

public class EvenDigitSum {
    public static void main(String[] args) {
        int sum = getEvenDigitSum(123456789);
        System.out.println(sum);
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}
