package RandomThings.JavaTwo;

public class DateCounter {
    public static void main(String[] args) {
        int[] day = new int[3];
        day[0] = 1;
        day[1] = 1;
        day[2] = 1;
        for (int i = 0; i < 1000; i++) {
            nextDay(day);
        }

    }
    public static void nextDay(int[] day) {
        day[1]++;
        if (day[1] > 31) {
            day[1] = 1;
            day[0]++;
            if (day[0] > 12) {
                day[2]++;
                day[0] = 1;
            }
        }
        System.out.printf("%d/%d/%d\n", day[0], day[1], day[2]);
    }
}
