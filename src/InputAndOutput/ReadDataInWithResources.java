package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadDataInWithResources {
    public static Map<Integer, Location> locationMap = new HashMap<>();
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("src/InputAndOutput/locations.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArray = line.split(",");
                int locationID = Integer.parseInt(lineArray[0]);
                String description = lineArray[1];
                locationMap.put(locationID, new Location(locationID, description, null));
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }

        try(Scanner scanner = new Scanner(new FileReader("src/InputAndOutput/directions.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split("," );
                locationMap.get(Integer.parseInt(splitLine[0])).addExits(splitLine[1], Integer.parseInt(splitLine[2]));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (Map.Entry<Integer, Location> entry : locationMap.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry<String, Integer> exit : locationMap.get(entry.getKey()).getExits().entrySet()) {
                stringBuilder.append(exit.getKey());
                stringBuilder.append(" ");
            }
            System.out.print("Location ID: " + entry.getKey() + "\n" +
                            "Location Description: " + entry.getValue().getDescription() + "\n" +
                            "Exits: " + stringBuilder.toString());
            System.out.println("\n");
        }

        // game test
        int currentLocationKey = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (currentLocationKey == 0) {
                break;
            }

            Location currentLocation = locationMap.get(currentLocationKey);
            System.out.println(currentLocation.getDescription());
            // get exits of current location
            Map<String, Integer> exits = currentLocation.getExits();
            // print out exits
            System.out.print("Possible exits: ");
            for (Map.Entry<String, Integer> entry : exits.entrySet()) {
                System.out.print(entry.getKey());
            }
            System.out.println();
            System.out.print("Where to boss: ");
            String userInput = scanner.nextLine().toUpperCase();

            // check if exits contains user input if so go in that direction
            if (exits.containsKey(userInput)) {
                // set new location to location given
                currentLocationKey = exits.get(userInput);
            } else {
                System.out.println("You can not go there");
            }
        }
    }
}
