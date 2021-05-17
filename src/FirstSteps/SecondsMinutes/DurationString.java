package FirstSteps.SecondsMinutes;

public class DurationString {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }
        int tempMin;
        int tempSeconds;
        int tempHours;
        int totalSeconds = minutes * 60 + seconds;

        tempHours = (int) (totalSeconds / 60) / 60;
        totalSeconds %= 60 * 60;
        tempMin = (int)(totalSeconds / 60);
        totalSeconds %= 60;
        tempSeconds = totalSeconds;

        String hourString = tempHours + "h ";
        String minsString = tempMin + "m ";
        String secString = tempSeconds + "s ";
        hourString = stringBuilder(tempHours, hourString);
        minsString = stringBuilder(tempMin, minsString);
        secString = stringBuilder(tempSeconds, secString);
        return hourString + minsString + secString;
    }

    public static String stringBuilder(int time, String myString) {
        if (time < 9) {
            myString = "0" + myString;
        }
        return myString;
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid";
        }
        int tempMins = seconds / 60;
        seconds %= 60;
        return getDurationString(tempMins, seconds);

    }

    public static void main(String[] args) {
        String hello = getDurationString(90,15);
        System.out.println(hello);
        System.out.println(getDurationString(5415));
        System.out.println(getDurationString(61,0));
    }
}
