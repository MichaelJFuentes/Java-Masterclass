package Collections.Shopping;

import java.util.Map;

public class Main {
    public static StockList stockList = new StockList();
    public static StockList itemSold = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("car", 10, 50);          // create new stock item and add them to list
        stockList.addToStock(temp   );
        temp = new StockItem("cake", 23, 12);
        stockList.addToStock(temp);
        temp = new StockItem("keyboard", 3,2);
        stockList.addToStock(temp);

        System.out.println(stockList);                                                   // print out the content of shopping list using

        // create basket
        Basket myBasket = new Basket("Mike");                                       // create a basket
        //System.out.println(getItem("keyboard").getQuantityInStock());                   // ensure items stock was properly added
        myBasket.addToBasket(temp, 2    );                                      //  add object to basket
        System.out.println(myBasket.removeFromBasket(temp, 1));                 // remove a single item from basket, leaving one left, testing for update to reserved field
        //Basket otherBasket = new Basket("Ed");                                        // create a second basket for testing multiple shopper and conflict with reserved items
        //otherBasket.addToBasket(getItem("keyboard"), 1);                              // testing if adding a item fully reserved is allowed to be added, does not work with current configuration
        myBasket.addToBasket(getItem("car"),5);                     // testing adding multiple items to list
        //System.out.println(myBasket);                                                 // printout stock list to check reserve status
        myBasket.checkOut();                                                            // testing to see if items are calculated properly
        //stockList.removeStock("keyboard");                                            // removing item and all stock from stock list
        System.out.println(stockList);                                                  // printout out list to ensure proper stock levels after checkout
        //System.out.println(stockList);                                                //
        //System.out.println(stockList);
    }

    public static StockItem getItem(String itemName) {                                  // method to quickly get object from list using key
        return stockList.getStockItem(itemName);
    }

}
