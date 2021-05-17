package InputAndOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ReadingObjectsClassList <T extends ReadingObjectsClass> {
    private ArrayList<T> myAccounts;

    public ReadingObjectsClassList(ArrayList<T> myAccounts) {
        this.myAccounts = myAccounts;
    }

    // create a defalut list
    public ReadingObjectsClassList() {
        this.myAccounts = new ArrayList<>();
    }

    // method to add account
    public boolean addAccount(T accountToBeAdded) {
        if (accountToBeAdded != null && !this.myAccounts.contains(accountToBeAdded)) {
            this.myAccounts.add(accountToBeAdded);
            return true;
        }
        return false;
    }
    // method to remove account
    public boolean removeAccount(T accountToBeRemoved) {
        if (accountToBeRemoved != null && this.myAccounts.contains(accountToBeRemoved)) {
            this.myAccounts.remove(accountToBeRemoved);
            return true;
        }
        return false;
    }

    // method to remove using account number
    public boolean removeAccount(int accountNumber) {
        T accountObject = this.myAccounts.get(accountNumber);
        return this.removeAccount(accountObject);
    }
    // method to get names of all people
    public String[] getFirstNames() {
        String[] firstNames = new String[this.myAccounts.size()];
        for (int i = 0; i < this.myAccounts.size(); i++) {
            firstNames[i] = this.myAccounts.get(i).getFirstName();
        }
        return firstNames;
    }

    public String[] getLastNames() {
        String[] lastNames = new String[this.myAccounts.size()];
        for (int i = 0; i < this.myAccounts.size(); i++) {
            lastNames[i] = this.myAccounts.get(i).getLastName();
        }
        return lastNames;
    }

    public String[][] getFullNames() {
        String[][] fullNameList = new String[this.myAccounts.size()][2];
        for (int i = 0; i < this.myAccounts.size(); i++) {
            fullNameList[i][0] = this.myAccounts.get(i).getFirstName();
            fullNameList[i][1] = this.myAccounts.get(i).getLastName();
        }
        return fullNameList;
    }
    // method to get all balances
    public double[] getAccountBalances() {
        double[] accountBalances = new double[this.myAccounts.size()];
        for (int i = 0; i < this.myAccounts.size(); i++) {
            accountBalances[i] = this.myAccounts.get(i).getBalance();
        }
        return accountBalances;
    }
    // method to calcalute total account balances
    public double calcluateGlobalAccountBalance() {
        double total = 0;
        for (double accountBalance : this.getAccountBalances()) {
            total += accountBalance;
        }
        return total;
    }

    // get copy of account list
    public ArrayList<T> getListCopy() {
        return new ArrayList<>(this.myAccounts );
    }

    // load objects into a list given a .txt file extension
    public boolean loadFileIntoList(String pathNameInStringFormat) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathNameInStringFormat))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                T temp = (T) (new ReadingObjectsClass(Integer.parseInt(splitLine[0]), splitLine[1],
                        splitLine[2], Double.parseDouble(splitLine[3])));
                // fix that /\
                this.addAccount(temp);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // load objects into a list given a .dat file extension
    public boolean loadFileIntoList(Path path) {
        try(Scanner scanner = new Scanner(Files.newBufferedReader(path))) {
            while (scanner.hasNext()) {
                this.myAccounts.add((T)new ReadingObjectsClass(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble()));
                scanner.nextLine();
            }
        } catch (IOException e ) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // get account object
    public T getAccount(int index) {
        return this.myAccounts.get(index);
    }

    // build and return account map
    public Map<Integer, ReadingObjectsClass> getAccountMap() {
        Map<Integer, ReadingObjectsClass> accounts = new HashMap<>();
        for (int i = 0; i < this.myAccounts.size(); i++) {
            accounts.put(this.myAccounts.get(i).getAccountNumber(), this.myAccounts.get(i));
        }
        return accounts;
    }
}
