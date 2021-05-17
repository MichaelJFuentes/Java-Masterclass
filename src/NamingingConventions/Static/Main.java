package NamingingConventions.Static;

public class Main {
    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number: " + firstInstance.getNumInstances());

        StaticTest secondI = new StaticTest("Second instance");
        System.out.println(secondI.getName() + " is instance number " + StaticTest.getNumInstances() );
    }
}
