package Collections.LinkedSets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    // add to basket

    // remove from basket que

    public int addToBasket(StockItem item, int qty) {
        if (item != null && qty > 0) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + qty);
        }
        return 0;
    }

    // remove from basket
//    public int removeFromBasket(StockItem item, int qty) {
//        if (qty > 0 && item != null && list.containsKey(item)) {
//            int inBasket = list.get(item);
//            if (qty == inBasket) {
//                list.remove(item);
//            }
//            if (qty <= inBasket) {
//                list.put(item, inBasket - qty);
//            }
//            return qty;
//        }
//        return 0;
//    }
    public int removeItemFromBasket(StockItem item, int qty) {
        if (item == null) {
            return 0;
        }
        if (qty < 0 ) {
            if (item.reserveStock(-qty)) {
                return qty;
            }
        }
        return 0;
    }

    // checkout customer
    public boolean checkOut() {
        for (Map.Entry<StockItem, Integer> entry : list.entrySet()) {
            // remove item from reserve
            entry.getKey().setReservedStock(entry.getValue());
            // remove item from stock items

        }
        return false;
    }
    // get customer shopping items
    public Map<StockItem, Integer> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String msg = "Basket Contents for " + this.name + "\n";
        double total = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            msg += item.getKey() + ". " + item.getValue() + " purchased\n";
            total += item.getKey().getPrice() * item.getValue();
        }
        return msg + "Total cost " + String.format("%.2f", total);
    }
}
