package Collections.Shopping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> stockList;                     // create a map with string key and item value

    public StockList() {
        this.stockList = new HashMap<>();
    }           // create a empty map

    // add item to stock list
    public int addToStock(StockItem item) {
        if (item == null) {                                             // if object passed is null do not modify
            return 0;
        }
        StockItem temp = this.stockList.getOrDefault(item.getName(), item   ); // check if object is in list, other wise create new object within list
        if (temp != item) {                                                     // if the item passed in is different than item within list
            temp.setQuantityInStock(item.getQuantityInStock());                 // change stock to include stock value of item passed in
            return temp.getQuantityInStock();                                   // return new stock number
        }
        stockList.put(temp.getName(), temp);                                    // place new stock in list
        return temp.getQuantityInStock();                                       // return stock levels for new item
    }

    public StockItem getStockItem(String name) {
        if (this.stockList.containsKey(name)) {                                 // check if string is a key in list
            return this.stockList.get(name);                                    // return the object, with a key for string passed in
        }
        return null;                                                            // if object is not present return null object
    }

    public boolean removeStock(String name) {                                   // remove item from stock, all stock items
        if (this.stockList.containsKey(name)) {                                  // check if item is in list
            stockList.remove(name);                                                 // remove the item from list
            return true;                                                         // return true
        }
        return false;
    }

    public Map<String, StockItem> getItems() {
        return Collections.unmodifiableMap(this.stockList);                     // returns a read only item list, used to prevent modification outside of setters
    }

    @Override
    public String toString() {
        String msg = "Items in stock\n";
        double total = 0;
        for (StockItem item : this.stockList.values()) {
            total += item.getPrice() * item.getQuantityInStock();
            msg = msg + " " +  item;
        }
        msg += "Total: " + total;
        return msg;
    }
}
