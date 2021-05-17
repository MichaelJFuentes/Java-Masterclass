package Collections;

import java.util.*;

public class UpdateMain {
    public static void main(String[] args) {
        TheatreRecall reampted = new TheatreRecall("Mike", 8,13);
        reampted.reserve("D12");

        List<TheatreRecall.Seat> copy = new ArrayList<>(reampted.getSeats());
        copy.add(reampted.new Seat("A00",13));
        copy.add(reampted.new Seat("B00", 13));
        printList(copy);
        Collections.sort(copy,TheatreRecall.PRICE_ORDER);
        printList(copy);
//        reampted.reserve("D12");
//        List<TheatreRecall> mySeats = new ArrayList<>(reampted.getSeats());
//        printList(mySeats);
//        mySeats.get(1).reserve();
//        reampted.reserve("A02");
//
//        //Collections.reverse(mySeats);
//        Collections.shuffle(mySeats);
//        System.out.println("Printing copy");
//        printList(mySeats);
//
//        System.out.println("Print object");
//        printList(reampted.getSeats());
//        System.out.println("\n\n\n");

//        List<TheatreRecall.Seat> newList = new ArrayList<>(reampted.seats.size());
//
//        Collections.copy(newList, reampted.seats);
    }

    public static void printList(List<TheatreRecall.Seat> myList) {
        for (TheatreRecall.Seat seat : myList){
            System.out.println(seat.getSeat() + " --> " + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================");
    }

//    public static void sortList(List<? extends TheatreRecall.Seat> myList) {
//        int counter = 0;
//        for (int i = 0; i < myList.size() -1; i++) {
//            for (int j = i + 1; j < myList.size(); j++) {
//                counter++;
//                if (myList.get(i).compareTo(myList.get(j)) > 0) {
//                    Collections.swap(myList, i, j);
//                }
//            }
//        }
//        System.out.println("itterations: " + counter);
//    }
}
