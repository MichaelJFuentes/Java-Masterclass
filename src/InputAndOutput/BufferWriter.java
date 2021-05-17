package InputAndOutput;

import java.io.*;

public class BufferWriter {
    public static void main(String[] args) {
        // buffer reader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/InputAndOutput/locations.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] lineSplit = line.split(",");
                System.out.println("Location ID: " + lineSplit[0] + " Location Description: " + lineSplit[1]);
                line = bufferedReader.readLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("src/InputAndOutput/bufferWriterOutput.txt")))) {
            printWriter.println("Hello World");
            printWriter.println("Bye Now");
            printWriter.println("Test");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/InputAndOutput/somefile.txt"))) {
            bufferedWriter.append("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.write("Something");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
