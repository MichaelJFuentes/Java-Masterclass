package FirstSteps.MintuesToYears;

public class MinutesToYearCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-546651);
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years;
            int days;
            final long minsInYear = 365 * 24 * 60;
            final long minsInDay = 24 * 60;
            long temp = minutes;
            years = minutes / minsInYear;
            minutes -= years * minsInYear;
            days = (int)(minutes / minsInDay);
            System.out.println(temp + " min = " +
                    years + " y and " +
                    days + " d");
        }
    }
}
