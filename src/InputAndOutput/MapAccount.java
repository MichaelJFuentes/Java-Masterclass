package InputAndOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapAccount {
    private Map<Integer, ReadingObjectsClass> myAccounts;

    public MapAccount(Map<Integer, ReadingObjectsClass> myAccounts) {
        this.myAccounts = myAccounts;
    }
    public MapAccount() {
        this.myAccounts = new HashMap<>();
    }

    public MapAccount(ArrayList<ReadingObjectsClass> myArrayList) {
        this.myAccounts = new HashMap<>();
        for (int i = 0; i < myArrayList.size(); i++) {
            this.myAccounts.put(myArrayList.get(i).getAccountNumber(), myArrayList.get(i));
        }
    }

    // get account object
    public ReadingObjectsClass getAccount(int accountNumber) {
        return this.myAccounts.get(accountNumber);
    }
    // add account
    public boolean addAccount(ReadingObjectsClass object) {
        if (object != null && this.myAccounts.containsKey(object.getAccountNumber())) {
            this.myAccounts.put(object.getAccountNumber(), object);
            return true;
        }
        return false;
    }
    // remove account
    public boolean removeAccount(ReadingObjectsClass account) {
        if (account != null && this.myAccounts.containsKey(account.getAccountNumber())) {
            return removeAccount(account.getAccountNumber());
        }
        return false;
    }

    public boolean removeAccount(int accountNumber) {
        if (accountNumber > 0 && this.myAccounts.containsKey(accountNumber)) {
            this.myAccounts.remove(accountNumber);
            return true;
        }
        return false;
    }


}
