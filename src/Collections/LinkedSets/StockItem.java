package Collections.LinkedSets;


public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reservedStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantityStock() {
        return this.quantityStock;
    }

    public int getReservedStock() {
        return this.reservedStock;
    }

    public void setReservedStock(int qty) {
        if (qty + this.reservedStock >= 0) {
            this.reservedStock += qty;
        } else {
            System.out.println("Somethign is wrong with setReservedStock");
        }
    }

    public boolean reserveStock(int qty) {
        if ( qty + this.reservedStock <= this.quantityStock && qty + this.reservedStock >= 0) {
            this.reservedStock += qty;
            return true;
        }
        return false;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

//    public boolean sellItem(int qty) {
//        // remove from que
//        this.reservedStock -= qty;
//        // remove from stock items
//        this.quantityStock -= qty;
//    }

    public void adjustStock(int quantity) {
        int newQuanity = this.quantityStock + quantity;
        if (newQuanity >= 0 ) {
            this.quantityStock = newQuanity;
        }
    }

    public void adjustStock(int quantity, boolean remove) {
        if (!remove) {
            adjustStock(quantity);
        } else {
            int newQuanity = this.quantityStock - quantity;
            if (newQuanity >= 0) {
                this.quantityStock = newQuanity;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }
        if (o != null ) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.price;
    }
}
