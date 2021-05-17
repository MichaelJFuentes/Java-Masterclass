package InputAndOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingObjectTest {
    public static void main(String[] args) {
        // create arrayList of account abjects
        ArrayList<ReadingObjectsClass> accounts = new ArrayList<>();
        ArrayList<ReadingObjectsClass> test = new ArrayList<>();
        // read data into array object
        Path filePath = Paths.get("src/InputAndOutput/Accounts.txt");
        // try to open file with resources
//        try(Scanner scanner = new Scanner(Files.newBufferedReader(filePath))) {
//            // reading in data using a line
//            while (scanner.hasNext()) {
//                String line = scanner.nextLine();
//                String[] lineSplit = line.split(" " );
//                // add object to array list
//                accounts.add(new ReadingObjectsClass(
//                        Integer.parseInt(lineSplit[0]),
//                        lineSplit[1],
//                        lineSplit[2],
//                        Double.parseDouble(lineSplit[3])
//                ));
//            }
//        } catch(IOException ioe) {
//            ioe.printStackTrace();
//        }
        // reading seralization from a text file
        try(Scanner bufferedReader = new Scanner(Files.newBufferedReader(filePath))) {
            while (bufferedReader.hasNext()) {
                accounts.add(new ReadingObjectsClass(bufferedReader.nextInt(), bufferedReader.next(), bufferedReader.next(), bufferedReader.nextDouble()));
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
        // write data to dat file
        Path fileDat = Paths.get("src/InputAndOutput/accounts.dat");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(fileDat)) {
            for (int i = 0; i < accounts.size(); i++) {
//                ReadingObjectsClass temp = accounts.get(i);
//                bufferedWriter.write(temp.getAccountNumber() + " ");
//                bufferedWriter.write(temp.getFirstName() + " ");
//                bufferedWriter.write(temp.getLastName() + " ");
//                bufferedWriter.write(temp.getBalance() + " ");
                bufferedWriter.write(accounts.get(i).writeToFile());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read data from dat file
        try(Scanner scanner = new Scanner(Files.newBufferedReader(fileDat))) {
            while (scanner.hasNext()) {
                test.add(new ReadingObjectsClass(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //printArrayList(accounts);
        printArrayList(test);
        System.out.println(calculateTotalOfAllAccounts(accounts));
        System.out.printf("%.2f\n", calculateTotalOfAllAccounts(test));
    }

    // print the contents of array list
    public static void printArrayList(ArrayList<ReadingObjectsClass> myList) {
        for (ReadingObjectsClass account : myList) {
            System.out.println(account);
        }
    }

    // method to get the total of all accounts
    public static double calculateTotalOfAllAccounts(ArrayList<ReadingObjectsClass> myList) {
        double total = 0;
        for (ReadingObjectsClass obj : myList) {
            total += obj.getBalance();
        }
        return total;
    }
}
