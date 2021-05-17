package InputAndOutput;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class ClassListTest {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/InputAndOutput/accounts.dat");
        ReadingObjectsClassList<ReadingObjectsClass> myList = new ReadingObjectsClassList<>();
        myList.loadFileIntoList(filePath);
        printArray(myList.getFirstNames());
        System.out.println(myList.calcluateGlobalAccountBalance());
        ReadingObjectsClass temp = myList.getAccount(1);
        System.out.println(temp);
        Map<Integer, ReadingObjectsClass> myAccounts = myList.getAccountMap();


    }

    public static void printArray(String[] array) {
        for (String name : array) {
            System.out.println(name);
        }
    }
}
