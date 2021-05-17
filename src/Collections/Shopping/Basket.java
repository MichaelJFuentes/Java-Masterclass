package Collections.Shopping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private Map<StockItem, Integer> contents;                       // create map with stockItem as key and items in basket as value

    public Basket(String name) {
        this.name = name;                                           // give basket a name and create new hashmap
        this.contents = new HashMap<>();
    }

    // get contents
    public Map<StockItem, Integer> getContents() {
        return Collections.unmodifiableMap(this.contents);        // provide access to read only map
    }

    // add item to basket
    public int addToBasket(StockItem item, int quantity) {      // add items to basket, thus adding to reserve items
        if (item == null) {
            return 0;                                           // return 0 if item is null, guard clause
        }
        if (item.setInReserve(quantity)) {                      // call to update reserve in item,
            this.contents.put(item, quantity);                  // if true update the basket list to include new items
            return quantity;                                    // return the count of items added to basket
        }
        System.out.println("Items are no longer in stock or have been reserved. Sorry for the trouble, " + this.name);      // if reach items could not be reserved
        return 0;                                               // return 0, indicating failure to add content
    }


    public int removeFromBasket(StockItem item, int quantity) {
        if (item == null) {                                     // guard clause
            return 0;
        }
        if (contents.containsKey(item)) {                       // check if items are in basket list
            int inShoppingCart = contents.get(item);            // get how many of n items are in basket

            if (quantity > 0 && quantity <= inShoppingCart) {   // check if quantity is positive
                this.contents.replace(item,inShoppingCart - quantity);  // replace the content in current list with same object and updated basket figure
                item.removeFromReserve(quantity);               // call to objects method to update reserve content
                return inShoppingCart - quantity;               // return the new quanity in shopping basket, could call the key value method
            }
        }
        return 0;
    }

    public void checkOut() {
        for (Map.Entry<StockItem, Integer> entry : this.contents.entrySet()) {          // iterate over map
            entry.getKey().setInReserve(-entry.getValue());                             // remove items from reserve
            entry.getKey().setQuantityInStock(-entry.getValue());                       // remove items from stock
        }
        System.out.println(this);                                                       // print out this objects toString, acting as receipt
        this.contents.clear();                                                          // clear basket content
    }
    @Override
    public String toString() {
        String msg = "Contents of shopping Cart\n";
        double total = 0;
        for (Map.Entry<StockItem, Integer> entry : this.contents.entrySet()) {
            double price = entry.getKey().getPrice() * entry.getValue();
            msg += "Name: " + entry.getKey().getName() + "    Price: " + entry.getKey().getPrice() +
                    "    Quantity: " + entry.getValue() + "   Total Item price: " + price + "\n";
            total += price;
        }
        msg += "Total basket cost: " + total;
        return msg;
    }
}
