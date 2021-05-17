package InputAndOutput;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    private static Map<Integer, Location> locationMap;
    private static Map<String, String> possibleDirection;

    @BeforeAll
    void initLocationMap() {
        locationMap = new HashMap<>();

        Map<String, Integer> tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("N", 5);
        tempExits.put("S",4);
        locationMap.put(1, new Location(1, "You are tanding at the end of a road before a small brick building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locationMap.put(2, new Location(2, "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locationMap.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("N", 1);
        locationMap.put(4, new Location(4, "You are in a vally beside a stream", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("S", 1);
        locationMap.put(5, new Location(5, "You are in the forest", tempExits));

        possibleDirection = new HashMap<>();
        possibleDirection.put("Quit", "Q");
        possibleDirection.put("North", "N");
        possibleDirection.put("East", "E");
        possibleDirection.put("South", "S");
        possibleDirection.put("West", "W");
    }


    @Test
    void locationOneTest() {

    }
    @org.junit.jupiter.api.Test
    void getLocationID() {
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
    }

    @org.junit.jupiter.api.Test
    void getExits() {
    }
}