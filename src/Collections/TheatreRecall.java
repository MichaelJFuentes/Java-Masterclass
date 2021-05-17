package Collections;

import java.util.*;

public class TheatreRecall {
    private final String theatreName;
    private final List<Seat> seats;

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat s1, Seat s2) {
                if (s1.getPrice() < s2.getPrice()) {
                    return -1;
                } else if (s1.getPrice() > s2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public TheatreRecall(String theatreName, int rows, int seatsPerRow) {
        this.theatreName = theatreName;
        // create seat array
        seats = new ArrayList<>();
        for (int i = 0; i < rows ; i++) {
            char rowName = (char)('A' + i);
            for (int j = 1; j < seatsPerRow + 1 ; j++) {
                double price = 12.00;
                String seatName = String.format("%s%02d",rowName,j);
                if ((rowName < 'D') && (j >= 4 && j <= 9)){
                    price = 14;
                } else if (rowName > 'F' || j < 4 || j > 9) {
                    price = 7;
                }
                Seat seat = new Seat(seatName,price);
                seats.add(seat);
            }
        }
    }


    public String getTheatreName() {
        return theatreName;
    }

    public Collection<Seat> getSeats() {
        return this.seats;
    }

    public boolean reserve(String seatName) {
        Seat seatRequest = new Seat(seatName, 0);
        int seatIndex = Collections.binarySearch(this.seats, seatRequest, null);
        return seats.get(seatIndex).reserve();
    }


    public boolean cancel(String seat) {
        Seat requestedSeat = new Seat(seat,0);
        int seatIndex = Collections.binarySearch(this.seats, requestedSeat, null);
        return seats.get(seatIndex).cancel();
    }

    // print seats in order


    public class Seat implements Comparable<Seat> {
        private final String seat;
        private double price;
        private boolean reserved = false;

        public Seat(String seat, double price) {
            this.seat = seat;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getSeat() {
            return this.seat;
        }

        public boolean reserve() {
            if (this.reserved) {
                System.out.println("Seat " + this.seat + " is already reserved");
                return false;
            } else {
                this.reserved = true;
                System.out.println("Seat " + this.seat + " has been reserved. Please insert payment");
                return true;
            }
        }

        private boolean cancel() {
            if (this.reserved) {
                System.out.println("Reservation on seat " + this.seat + " has been canceled");
                this.reserved = false;
                return true;
            } else {
                System.out.println("Seat " + this.seat + " has not been reserved yet");
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seat.compareToIgnoreCase(seat.getSeat());
        }
    }
}
