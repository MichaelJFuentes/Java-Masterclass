package FlowControl;

public class WhileBasics {
    public static void main(String[] args) {
        int number = 4;
        int finish = 20;
//        while (number <= finish) {
//            System.out.println(number + " is even: " + isEven(number));
//            number++;
//        }
        int sum = 0;
        int counter = 0;
        while (number <= finish) {
            if (isEven(number)) {
                System.out.println("Even number " + number);
                sum += number;
                counter++;
                if (counter > 4 ) {
                    System.out.println("break occured at " + counter);
                    break;
                }
            }
            number++;
        }
        System.out.println("Sum: " + sum);

//        number = 4;
//        do {
//            System.out.println(number + " is even: " + isEven(number));
//            number++;
//        } while (number <= finish);
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
