package Exceptions;

public class intDivision {
    public static void main(String[] args) {
        int x = 90;
        int y = 0;
        divideLBYL(x, y);
        divideEAFP(x, y);
    }

    private static int divideLBYL(int x, int y ) {
        if (y != 0 ){
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y ) {
        try {
            return x / y;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("caught expection");
            return 0;
        }
    }


}
