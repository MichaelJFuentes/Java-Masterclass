package FirstSteps;

public class SpeedConverterExercise {
    public static void main(String[] args) {
        printConversion(0);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long miles;
            double kmPerMiles = 1.609;
            miles = Math.round(kilometersPerHour / kmPerMiles);
            return miles;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = "+ miles + " mi/h");
        }
    }
}
