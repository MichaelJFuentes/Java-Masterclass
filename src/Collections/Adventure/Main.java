package Collections.Adventure;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> location = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        //location.put(0, new Location(0,"You are sitting in front of a computer learning Java"));
        //location.put(1, new Location(1, "You are tanding at the end of a road before a small brick building"));
        //location.put(2, new Location(2, "You are at the top of a hill"));
        //location.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        //location.put(4, new Location(4, "You are in a vally beside a stream"));
        //location.put(5, new Location(5, "You are in the forest"));

        Map<String, Integer> tempExit;

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("N", 5);
        tempExit.put("S",4);
        location.put(1, new Location(1, "You are tanding at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        location.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        location.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("N", 1);
        location.put(4, new Location(4, "You are in a vally beside a stream",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("S", 1);
        location.put(5, new Location(5, "You are in the forest",tempExit));

        // hashmap for key values
        Map<String, String>  possibleDirection = new HashMap<>();
        possibleDirection.put("Quit", "Q");
        possibleDirection.put("North", "N");
        possibleDirection.put("EAST", "E");
        possibleDirection.put("SOUTH", "S");
        possibleDirection.put("WEST", "W");

        int loc = 1;

        while (true) {
            if (loc == 0) {
                break;
            }
            System.out.println(location.get(loc).getDescription());
            Map<String, Integer> exits = location.get(loc).getExits();
            System.out.print("Available exits are: ");
            Set<String> avaliableExits = exits.keySet();
            for (String exit :
                    avaliableExits) {
                System.out.print(exit + " ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            String[] userInput = direction.split(" ");
            if (userInput.length > 1) {
                for (String word :
                        userInput) {
                    if (possibleDirection.containsKey(word)) {
                        direction = possibleDirection.get(word);
                        break; 
                    }
                }
            }
//            for (String word :
//                    userInput) {
//                if (avaliableExits.contains(word) || (word.equals("NORTH") ||
//                        word.equals("SOUTH") || word.equals("WEST") || word.equals("EAST") || word.equals("QUIT"))) {
//                    direction = word.charAt(0) + "";
//                    break;
//                }
//            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("you can not go in that direction");
            }
        }
    }
}
