package InputAndOutput;

import java.io.*;
import java.nio.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class JavaNIO {
    public static void main(String[] args) {
        Path locPath = FileSystems.getDefault().getPath("l.txt");
        Path dirPath = FileSystems.getDefault().getPath("d.txt");
        Path dataFile = FileSystems.getDefault().getPath("test.dat");
        // write to file
        try (BufferedWriter out = new BufferedWriter(new FileWriter("test.dat"))) {
            out.write(123);
            out.write("Some String Value");
            out.newLine();
            out.write("New Line");
        } catch (IOException e) {
            System.out.println("File not found error " + e.getMessage());
        }

        // read from the file above
        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {
            int number = in.read();
            String lineOne = in.readLine();
            String lineTwo = in.readLine();

            System.out.println(number);
            System.out.println(lineOne);
            System.out.println(lineTwo);

            // what happens if reading end of file line
            String lastLine = in.readLine();
            // results in null value
            System.out.println(lastLine);
            // what would happen if reading a value after the end of line value
            String afterLast = in.readLine();
            System.out.println(afterLast);
            // another null value
        } catch (IOException e) {
            System.out.println("File not found when reading " + e.getMessage());
        }
        System.out.println();
        // read the contents of file using while loop
        try(BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

        } catch (IOException e ) {
            e.printStackTrace();
        }
        System.out.println();
        //read from file
        try (Scanner scanner = new Scanner(Files.newBufferedReader(locPath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
