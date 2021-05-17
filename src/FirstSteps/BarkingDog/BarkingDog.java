package FirstSteps.BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean returnWakeUp;
        if (hourOfDay < 0 || hourOfDay > 23) {
            returnWakeUp =  false;
        } else if (barking == false){
            returnWakeUp = false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            returnWakeUp = true;
        } else {
            returnWakeUp = false;
        }
        return returnWakeUp;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,-1));
    }
}
