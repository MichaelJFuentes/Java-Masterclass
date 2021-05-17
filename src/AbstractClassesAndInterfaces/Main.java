package AbstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        InterfaceBasics deskPhone = new InterfaceBasicMain(123456, true);
        deskPhone.powerOn();
        deskPhone.dial(3425);
        deskPhone.answer();

        System.out.println();

        InterfaceBasics phone;
        phone = new InterfaceBasicMain(234, false   );
        phone.powerOn();
        phone.dial(324);
        phone.answer();

        System.out.println();

        MobilePhone mikesPhone = new MobilePhone(2425);
        mikesPhone.callPhone(24234);
        mikesPhone.answer();
        mikesPhone.powerOn();
        mikesPhone.dial(234562);
    }
}
