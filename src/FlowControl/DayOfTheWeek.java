package FlowControl;

public class DayOfTheWeek {
    public static void main(String[] args) {
            printDayOfTheWeek(4);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
