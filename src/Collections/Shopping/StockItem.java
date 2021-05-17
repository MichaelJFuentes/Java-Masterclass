package Collections.Shopping;

import java.util.Objects;

public class StockItem implements Comparable{
    private final String name;                                              // giving stock item name for easy identification
    private final double price;                                             // price slot is final to prevent changes
    private int quantityInStock;                                            // total items store has to sell
    private int inReserve;                                                  // items people have added to their cart, number can not be higher than stock

    public StockItem(String name, double price, int quantityInStock) {      //standard constructor including starting stock
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.inReserve = 0;
    }

    public StockItem(String name, double price) {
        this(name, price, 0);
    }   // constructor without including stock

    public String getName() {
        return this.name;
    }                           // get name of item

    public double getPrice() {
        return this.price;
    }                        // get price of item

    public int getQuantityInStock() {
        return this.quantityInStock;
    }       // get item in stock, not including items reserved

    public void setQuantityInStock(int quantityInStock) {
        if (this.quantityInStock + quantityInStock >= 0) {                  // ensure new stock will be positive
            this.quantityInStock += quantityInStock;                        // update stock value of item
            return;                                                         // break out of method to prevent print
        }
//        System.out.println(quantityInStock);
//        System.out.println(this.quantityInStock);
        System.out.println("Not enough quantity in stock");                 // if new values is negative, inform user of low stock
    }

    public int getInReserve() {
        return this.inReserve;
    }                   // get reserve value

    public boolean setInReserve(int inReserve) {
        int newInReserve = this.inReserve + inReserve;                    // temp variable used to store new reserve
        if (newInReserve <= this.quantityInStock && newInReserve >= 0) {  // ensure new reserve is less than or equal to stock and new reserve is greater than 0
            this.inReserve += inReserve;                                  // assignment
            return true;                                                  // return sucessful operation, can be int
        }
        return false;                                                    // if reached operation failed
    }

    public boolean removeFromReserve(int qty) {                         // remove item from reserve
        int newReserve = this.inReserve - qty;                          // remove from reserve que, assign to temp
        if (newReserve >= 0) {                                          // new reserve has to be equal to greater than 0
            this.inReserve = newReserve;                                // assigment made perm
            return true;                                                // return success
        }
        return false;                                                   // if reached failure
    }

    @Override
    public boolean equals(Object o) {                                   // allow passing any object
        if (this == o) return true;                                     // check if current object is same as passed, if so return true, short curcite evaluation
        if (o == null || getClass() != o.getClass()) return false;      // check if objects are not null or different classes
        StockItem stockItem = (StockItem) o;                            // cast object to stock item, and store in new var, for simple calling
        return Double.compare(stockItem.price, price) == 0 &&           // return t/f, ensure both price and name match
                name.equals(stockItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {                                            // if objects are same return 0
            return 0;
        }
        if (o != null) {
            return this.name.compareTo(((StockItem)o).getName());   // compares items based on name field
        }
        throw new NullPointerException();                           // used to handle null objects passed, could use if statement instead
    }

    @Override
    public String toString() {
        String msg = "Name: " + this.name + " - " +
                "Price: " + this.price + " - " +
                "Quantity: " + this.quantityInStock + " - " +
                "Reserve: " + this.inReserve + "\n";
        return msg;
    }
}
