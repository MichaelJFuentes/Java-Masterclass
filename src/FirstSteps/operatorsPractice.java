package FirstSteps;

public class operatorsPractice {

    public static void main(String[] args) {

        double myVar = 20;
        double second = 80;
        double product = (myVar + second) * 100;
        double remainder = product % 40;
        boolean isZero = remainder == 0 ? true : false;
        
        if (isZero == false) {
            System.out.println("Got some remainder");
        }
    }
}
