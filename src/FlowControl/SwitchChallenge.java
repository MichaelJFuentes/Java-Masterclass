package FlowControl;

public class SwitchChallenge {
    public static void main(String[] args) {
        char myLetter = 'c';
        myLetter = Character.toUpperCase(myLetter);
        switch (myLetter) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Default");
                break;
        }
        // simple method
        switch (myLetter) {
            case 'A': case 'B': case 'C': case 'D':
                System.out.println(myLetter + " was found");
                break;
            default:
                System.out.println("not found");
        }
    }
}
