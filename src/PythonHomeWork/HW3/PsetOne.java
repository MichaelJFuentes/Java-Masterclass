package PythonHomeWork.HW3;

import InputAndOutput.BufferWriter;

import java.io.*;

public class PsetOne {
    public static double calculateCharge(int qty, String bookType) {
        if (qty < 0 || bookType == null || bookType.isEmpty()) {
            return 0;
        }
        // deal with miss match case
        bookType = bookType.toLowerCase();
        double charge = 0;
        switch (bookType) {
            case "fiction":
                charge = 10;
                break;
            case "nonfiction":
                charge = 12.75;
                break;
            case "historical":
                charge = 5.95;
                break;
            case "technical":
                charge = 25.00;
                break;
            default:
                charge = 6;
                break;
        }
        return charge * qty;
    }

    // write to file
    public static void writeFileData() {
        try(BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("src/PythonHomeWork/HW3/books.txt"))) {
            bufferWriter.write("fiction\n2\n");
            bufferWriter.write("fiction\n3\n");
            bufferWriter.write("nonfiction\n4\n");
            bufferWriter.write("historical\n3\n");
            bufferWriter.write("technical\n6\n");
            bufferWriter.write("nonfiction\n3\n");
            bufferWriter.write("fiction\n1\n");
            bufferWriter.write("technical\n10\n");
            bufferWriter.write("historical\n4\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    // read from file
    public static double calculateChargeFromFile(String fileName) throws NullPointerException{
        if (fileName == null ||fileName.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String type = bufferedReader.readLine();
            while (type != null){
                int qty = Integer.parseInt(bufferedReader.readLine());
                double charge = calculateCharge(qty, type);
                total += charge;
                System.out.println("The total charge is $" + String.format("%.2f", charge));
                type = bufferedReader.readLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Total Charge $" + total);
        return total;
    }

    // main calculate chareg
    public static void main(String[] args) {
        writeFileData();
        calculateChargeFromFile("src/PythonHomeWork/HW3/books.txt");
    }
}
