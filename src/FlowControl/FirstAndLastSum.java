package FlowControl;

public class FirstAndLastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return - 1;
        }
        if (number < 10) {
            return number + number;
        }
        int last = number % 10;
//        System.out.println(last);
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
        }
//        System.out.println(digit);
        return last + digit;
    }
}
