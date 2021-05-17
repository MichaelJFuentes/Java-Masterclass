package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomSetLearning {
    public static void main(String[] args) {
        Set<String> myStringSet = new HashSet<>();
        System.out.println(myStringSet.add("String One"));
        System.out.println(myStringSet.add("String One"));  // what will be the outcome
        System.out.println(myStringSet.add("String Two"));
        System.out.println(myStringSet.add("String Twp"));

        // print out all items in set
        for (String item :
                myStringSet) {
            System.out.println(item + " --> " + item.hashCode());
        }

        // explain how objects in strings are stored
        System.out.println(myStringSet.size());

        // iterate over hashset
        Iterator<String> iterator = myStringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Personal Class example ");
        SetPersonalClass<String> myClassSet = new SetPersonalClass<>("Tron");
        myClassSet.addToSet("Item Zero");
        myClassSet.addToSet("Item One");
        myClassSet.addToSet("Item Two");
        myClassSet.addToSet("Item Three");
        myClassSet.printValues(true);



        long hashSum = myClassSet.sumOfSet();
        System.out.println(hashSum);
//      Why does the following not work
//        Iterator<String> iterator1 = myClassSet.getIterator();
//        myClassSet.removeFromSet("Item Zero");
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }

        System.out.println("==========================================");
        System.out.println("Int things");
        SetPersonalClass<Integer> ints = new SetPersonalClass<>("Integers");

        ints.addToSet(1);
        ints.addToSet(2);
        ints.addToSet(3);
        ints.addToSet(4);
        ints.addToSet(5);

        ints.printValues(true);
        System.out.println(ints.sumOfSet());

        System.out.println(calculateSumOfDigits(12345));
        System.out.println(recursion(12345));

    }
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int recursion(int number) {
        int digit = number % 10;

        if (digit > 0) {
            return digit + recursion(number / 10);
        }
        return number;
    }
}
