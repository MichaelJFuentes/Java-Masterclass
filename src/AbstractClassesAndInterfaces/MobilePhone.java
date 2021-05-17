package AbstractClassesAndInterfaces;

public class MobilePhone implements InterfaceBasics{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Moblie phone is off");
        }
    }

    @Override
    public void answer() {
        if (isRinging()) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            System.out.println("Incorrect number");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
