package InputAndOutput;

import org.junit.platform.commons.function.Try;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<>();

//        try(FileWriter locFile = new FileWriter("src/InputAndOutput/locations.txt");
//            FileWriter dirFile = new FileWriter("src/InputAndOutput/directions.txt")) {
//            for (Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                for (String direction : location.getExits().keySet()) {
//                    dirFile.write(location.getLocationID() + "," + direction + ","+ location.getExits().get(direction) + "\n");
//                }
//            }
//        }

//        FileWriter localFile = null;
//        try {
//            localFile = new FileWriter("src/InputAndOutput/locations.txt");
//            for (Location location : locations.values()) {
//                localFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                //throw new IOException("test exception thrown while writing");  for testing
//            }
////        } catch (IOException e) {
////            System.out.println("IOException");
////            e.printStackTrace();
//        } finally {
//            if (localFile != null) {
//                localFile.close();
//
////            } catch (IOException Io) {
////                System.out.println("In finally");
////            }
//            }
//        }

        // writing with try with resources


//    static {
//        Map<String, Integer> tempExit;
//
//        tempExit = new HashMap<>();
//        tempExit.put("W", 2);
//        tempExit.put("E", 3);
//        tempExit.put("N", 5);
//        tempExit.put("S",4);
//        locations.put(1, new Location(1, "You are tanding at the end of a road before a small brick building",tempExit));
//
//        tempExit = new HashMap<>();
//        tempExit.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//        tempExit = new HashMap<>();
//        tempExit.put("W", 1);
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
//
//        tempExit = new HashMap<>();
//        tempExit.put("W", 2);
//        tempExit.put("N", 1);
//        locations.put(4, new Location(4, "You are in a vally beside a stream",tempExit));
//
//        tempExit = new HashMap<>();
//        tempExit.put("W", 2);
//        tempExit.put("S", 1);
//        locations.put(5, new Location(5, "You are in the forest",tempExit));
//    }
        // reading data from file and creating classes
        static {
            Scanner scanner = null;
            try {
                scanner = new Scanner(new FileReader("src/InputAndOutput/locations.txt"));
                scanner.useDelimiter(",");
                while (scanner.hasNextLine()) {
                    int location = scanner.nextInt();
                    scanner.skip(scanner.delimiter()); // move past the comma
                    String description = scanner.nextLine();
                    System.out.println("Import location " + location + ": " + description);
                    Map<String, Integer> tempExit = new HashMap<>();
                    locations.put(location, new Location(location, description, tempExit));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }

            // now read the exits
            try {
                scanner = new Scanner(new BufferedReader(new FileReader("src/InputAndOutput/directions.txt")));
                scanner.useDelimiter(",");
                while (scanner.hasNextLine()) {
                    int location = scanner.nextInt();
                    scanner.skip(scanner.delimiter());
                    String direction = scanner.next();
                    scanner.skip(scanner.delimiter());
                    String dest = scanner.nextLine();
                    int option = Integer.parseInt(dest.substring(1));
                    System.out.println("location: " + location + "  : direction: " + direction + " option: " + option);
                    locations.get(location).addExits(direction, option);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }


    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {
        //locations.putAll(m);
    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
