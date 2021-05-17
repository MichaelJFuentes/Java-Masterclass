package Collections.LinkedSets;

public class LinkedHashMap {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        // items in stock
        StockItem temp = new StockItem("Bread", .86, 100);
        stockList.addStock(temp);
        temp = new StockItem("Cake", 10, 7  );
        stockList.addStock(temp);
        temp = new StockItem("Car", 142, 2);
        stockList.addStock(temp);
        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);
        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);
        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);
        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
        // items in customer basket
        Basket basketOne = new Basket("Mike");

        // ADD working items to customer basket
        sellItem(basketOne, "Car", 1);
        sellItem(basketOne, "Cake", 3);
        System.out.println(basketOne);
        System.out.println(stockList);

        // add non working items to customer basket

        //basketOne.addToBasket(random,1);
        // remove some item from basket
        //basketOne.removeFromBasket(car, 1);
        // remove a single instant of a item
//        basketOne.removeFromBasket(cake,1);
//
//        // print out the content of basket
//        System.out.println(basketOne);
//        System.out.println(stockList.checkOut(basketOne.items()));
//        System.out.println(stockList);
        // print out the contents of list after shopper complete
        // new customer trying to buy items that have been sold
    }

    public static int sellItem(Basket basket, String item, int qty) {
        if (basket == null || item.isEmpty()) {
            return 0;
        }
        if (stockList.containsItem(item)) {
            StockItem temp = stockList.get(item);
            int inStock = temp.getQuantityStock();
            if (qty > inStock) {
                System.out.println("We are running low on stock check back later");
                return 0;
            } else {
                stockList.sellStock(item, qty);
                // add to basket
                return basket.addToBasket(stockList.get(item), qty);
            }
        } else {
            System.out.println("We do not sell that item");
        }
        return 0;
    }

    // add item to shopping basket
    public static boolean addToBasket(Basket basket, String item, int qty) {
        if (basket == null || item.isEmpty()) {
            return false;
        }
        if (stockList.containsItem(item)) {
            StockItem temp = stockList.get(item);
            int open = temp.getQuantityStock() - temp.getReservedStock();
            if (qty <= open) {
                temp.reserveStock(qty);
                return true;
            }
        }
        return false;
    }

    // remove from basket
    public static boolean removeFromBasket(Basket basket, String name, int qty) {
        if (basket == null || name.isEmpty()) {
            return false;
        }
        if (stockList.containsItem(name)) {
            StockItem temp = stockList.get(name);
            int itemsInBasket = basket.items().get(temp);
            System.out.println(itemsInBasket);
            if (qty <= itemsInBasket) {
                return true;
            }

        }
        return false;
    }
}
