package InputAndOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NIOBasics {
    public static void main(String[] args) {
        Path pathOne = Paths.get("test.dat");
        if (Files.exists(pathOne)) {
            try(Scanner scanner = new Scanner(Files.newBufferedReader(pathOne))) {
                //int n = scanner.nextInt();
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
                //System.out.println(n);

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
