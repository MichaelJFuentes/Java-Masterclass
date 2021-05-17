package FirstSteps.LeapYearCalculator;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean returnValue;
        if (year <= 1 || year >= 9999) {
            returnValue = false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                   if (year % 400 == 0) {
                       returnValue = true;
                   } else {
                       returnValue = false;
                   }
                } else {
                    returnValue = true;
                }
            } else {
                returnValue = false;
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
