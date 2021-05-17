package Arrays;

import java.util.ArrayList;

public class ArrayListGroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }



    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    private void modifyList(String item, int position) {
        groceryList.set(position, item);
    }

    public void modifyList(String name) {
        int number = groceryList.indexOf(name);
        if (number > 0) {
            modifyList(name, number);
        }
    }

    private void removeItem(int position) {
        groceryList.remove(position);
    }

    public void removeItem(String name) {
        int number = groceryList.indexOf(name); 
        if ( number > 0 ) {
            removeItem(number);
        }
    }

    // find item
    public String findItem(String searchItem) {
        boolean exist = groceryList.contains(searchItem);
        if (exist) {
            int index = groceryList.indexOf(searchItem);
            return groceryList.get(index);
        }
        return null;
    }
}

