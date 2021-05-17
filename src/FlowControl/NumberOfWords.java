package FlowControl;

public class NumberOfWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(123));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        System.out.println(getDigitCount(1000));
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
        System.out.println(getDigitCount(0));
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        do {
            number /= 10;
            counter++;
        }
        while (number > 0);
        return counter;
    }

    public static int reverse(int number) {
        int newNumber = 0;
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            newNumber += digit;
            newNumber *= 10;
        }
        newNumber /= 10;
        if (isNegative) {
            newNumber = newNumber * -1;
        }
        return newNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);
            number = reverse(number);

            for (int i = 0; i < digitCount; i++) {
                int digit = number % 10;
                number /= 10;
                switch (digit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }

            }
        }
    }

}
