package FirstSteps.MegaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilBytes) {
        if (kilBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kilBytes / 1024;
            int remainingKilobytes = kilBytes % 1024;
            System.out.println(kilBytes + " KB = " +
                    megabytes + " MB and " +
                    remainingKilobytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
