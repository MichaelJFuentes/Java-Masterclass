package FlowControl;

public class SwitchBasics {
    public static void main(String[] args) {
        int value = 5;
        switch (value) {
            case 1:
                System.out.println("Value one");
                break;
            case 2:
                System.out.println("Value two");
                break;
            case 3:
                System.out.println("Value three");
                break;
            case 4: case 5:
                System.out.println("The value was 4 or 5");
                break;
            default:
                System.out.println("No covered case");
                break;
        }
    }
}
