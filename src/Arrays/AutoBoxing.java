package Arrays;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> myIntArray = new ArrayList<Integer>();
        myIntArray.add(3);
        System.out.println(myIntArray.get(0));
        System.out.println(myIntArray.get(0).intValue());
    }
}
