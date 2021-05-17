package Collections.LinkedSets;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    // add stock item method
    public int addStock(StockItem item ) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if (inStock != item) {
                inStock.adjustStock(item.getQuantityStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    // see if a item exit in stock list
    public boolean containsItem(String itemName) {
        if (list.containsKey(itemName)) {
            return true;
        }
        return false;
    }

    public int sellStock(String item, int qty) {
        StockItem inStock = list.getOrDefault(item, null);
        if (inStock != null && inStock.getQuantityStock() >= qty) {
            inStock.adjustStock(-qty);
            return qty;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    // check out customer
    public boolean checkOut(Map<StockItem, Integer> customerItems) {
        if (customerItems.isEmpty()) {
            System.out.println("basket is empty");
            return false;
        }
        for (Map.Entry<StockItem, Integer> item : customerItems.entrySet()) {
            int itemsToSell = item.getValue();
            StockItem stockItem = item.getKey();
            if (itemsToSell <= this.list.get(stockItem.getName()).getQuantityStock()) {
                this.list.get(stockItem.getName()).adjustStock(itemsToSell, true);
            } else {
                System.out.println(stockItem);
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String msg = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();
            String itemName = stockItem.getName();
            totalCost += itemValue;
            msg += itemName + " There are " + stockItem.getQuantityStock() + " in stock. Value of items: " + String.format("%.2f", itemValue) + "\n";
        }
        return msg += "Total Value:  " + String.format("%.2f", totalCost);    }
}
