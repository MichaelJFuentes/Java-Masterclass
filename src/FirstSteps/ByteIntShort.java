package FirstSteps;

public class ByteIntShort {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 10 * (myByte + myShort + myInt) + 50000;
        System.out.println(myLong);
    }
}
