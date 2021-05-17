package InputAndOutput;

import java.util.*;

public class Main {
    private static Locations locations = new Locations();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
            Location currentLocation = locations.get(loc);
            System.out.println(currentLocation.getDescription());
            Map<String, Integer> exits = currentLocation.getExits();
            System.out.print("Available exits are: ");
            Set<String> avaliableExits = exits.keySet();

            for (String exit :
                    avaliableExits) {
                System.out.print(exit + " ");
            }
            System.out.println();
            System.out.print("Were to: ");

            String direction = scanner.nextLine().toUpperCase();
            direction = "North";
            String[] userInput = direction.split(" ");
            if (userInput.length > 1) {
                for (String word :
                        userInput) {
                    if (possibleDirection.containsKey(word) || possibleDirection.containsValue(word)) {
                        direction = possibleDirection.get(word);
                        break; 
                    }
                }
            }

            if (exits.containsKey(direction) || exits.containsValue(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("you can not go in that direction");
            }
        }
    }
}
