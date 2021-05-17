package FlowControl;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean isVaild(int number) {
        if (number < 10 || number > 99) {
            return false;
        }
        return true;
    }
    public static boolean hasSharedDigit(int num1, int num2) {
//        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
//            return false;
//        }
        if (!isVaild(num1) || !isVaild(num2)) {
            return false;
        }
        while (num1 > 0) {
         int num1D1 = num1 % 10;
         num1 /= 10;
         int num2D1 = num2 % 10;
         num2 /= 10;

         if (num1D1 == num2D1 || num1D1 == num2) {
             return true;
         }
        }
        return false;

    }
}
