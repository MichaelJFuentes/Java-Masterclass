package RandomThings.JavaTwo.OPMA;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaTwoEmailGenerator {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> bigNames = new ArrayList<>();
        try (Scanner fileReader = new Scanner(new FileReader("src/RandomThings/JavaTwo/OPMA/rawNameFile.txt"))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.isEmpty()) {
                    names.add(line.substring(9) + "\n");
                    String[] splitName = line.split(" ");
                    if (splitName.length == 3) {
                        emails.add(String.format("%s.%s@mavs.uta.edu%n", splitName[1], splitName[2]));
                    } else {
                        bigNames.add(line.substring(9) + "\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/RandomThings/JavaTwo/OPMA/emailFile.txt"))) {
            for (String email : emails) {
                bufferedWriter.write(email);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/RandomThings/JavaTwo/OPMA/JustNames.txt"))) {
            for (String name : names) {
                bufferedWriter.write(name);
            }

            bufferedWriter.newLine();
            for (String name : bigNames) {
                bufferedWriter.write(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
