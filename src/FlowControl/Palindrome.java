package FlowControl;

public class Palindrome {
    public static void main(String[] args) {
        boolean pal = isPalindrome(25);
        System.out.println(pal);
    }


    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        if (number < 11) {
            return false;
        }
        int oldNumber = number;
        int newNumber = 0;
        while (number > 0) {
            newNumber += number % 10;
            newNumber *= 10;
            number /= 10;
        }
        newNumber /= 10;
        if (oldNumber == newNumber) {
            return true;
        } else {
            return false;
        }
    }
}
