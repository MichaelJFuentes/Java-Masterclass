package RandomThings.JavaTwo;

import InputAndOutput.BufferWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaTwoEmailGenerator {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> bigNames = new ArrayList<>();
        try (Scanner fileReader = new Scanner(new FileReader("src/RandomThings/javaTwoPlainNames.txt"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.isEmpty()) {
                    //emails.add(line.substring(9));
                    names.add(line.substring(9) + "\n");
                    String[] splitName = line.split(" ");
                    if (splitName.length == 3) {
                        //System.out.printf(splitName[1] + "." + splitName[2] + "@mavs.uta.edu" + "\n");
                        emails.add(String.format("%s.%s@mavs.uta.edu%n", splitName[1], splitName[2]));
                    } else {
                        bigNames.add(line.substring(9) + "\n");
//                        System.out.printf(splitName[1] + "." + splitName[splitName.length - 1] + "@mavs.uta.edu" + "\n");
//                        System.out.println(line.substring(9));
//                        emails.add(line.substring(9) + "\n");
                    }
                    //System.out.println(line.substring(9) + "@mavs.uta.edu");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/RandomThings/javaTwoEmailsOut.txt"))) {
            for (String email : emails) {
                bufferedWriter.write(email);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/RandomThings/javaTwoJustNames.txt"))) {
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
