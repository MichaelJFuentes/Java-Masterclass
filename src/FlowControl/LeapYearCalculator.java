package FlowControl;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
    }

    public static boolean isLeapYear(int year) {
        boolean returnValue;
        if (year <= 1 || year >= 9999) {
            returnValue = false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) returnValue = true;
                else returnValue = false;
            }
            else returnValue = true;
        }
        else returnValue = false;
        return returnValue;
    }


    public static int getDaysInMonth(int month, int year) {
        int days = -1;
        boolean isLeapYear = isLeapYear(year);
        if (year < 1 || year > 9999) {
            return -1;
        }
        if (month < 1 || month > 12) {
            return -1;
        }
        System.out.println(isLeapYear);
        if (isLeapYear) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    days = 29;
                    break;
            }
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    days = 28;
                    break;
            }
        }
        return days;
    }
}
