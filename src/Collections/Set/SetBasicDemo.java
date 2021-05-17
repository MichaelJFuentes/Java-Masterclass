package Collections.Set;

import java.util.*;

public class SetBasicDemo {
    private static Map<String, HeavlyBody> solareSystem = new HashMap<>();
    private static Set<HeavlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavlyBody temp = new HeavlyBody("Mercury", 88);
        solareSystem.put(temp.getName(), temp);
        planets.add(temp);
        HeavlyBody tempMoon = new HeavlyBody("mercury moon", 50);
        solareSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        for (int i = 0; i < 100; i++) {
            int fizz = i % 3;

        }

        temp = new HeavlyBody("Venus", 225);
        solareSystem.put(temp.getName(), temp);
        planets.add(temp);
        tempMoon = new HeavlyBody("Venus Moon", 32);
        solareSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavlyBody("Earth", 365);
        solareSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavlyBody("Moon", 27);
        solareSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        HeavlyBody pluto = new HeavlyBody("Pluto", 842);
        planets.add(pluto);

        tempMoon = new HeavlyBody("Random Moon", 38);
        solareSystem.put(tempMoon.getName(), tempMoon);
        

        System.out.println("Planets");
        for (HeavlyBody planet :
                planets) {
            System.out.println(planet.getName());
            for (HeavlyBody moons : planet.getSatellites()) {
                System.out.println("\t" + moons.getName());
            }
        }


        System.out.println("+++++++++++++++++++++++++++++");
        // create a set of just moons
//        Set<String> moons = new HashSet<>();
//        for (String obj : solareSystem.keySet()) {
//            HeavlyBody tempBody = solareSystem.get(obj);
//            for (HeavlyBody moon :
//                    tempBody.getSatellites()) {
//
//            }
//
//        }
        System.out.println();
        Set<HeavlyBody> moons = getMoonSet(solareSystem);
        for (HeavlyBody moon :
                moons) {
            System.out.println(moon.getName());
        }

        System.out.println("+++++++++++++++");
        printObjects(solareSystem);

        System.out.println();
        iterateOverSet(planets);


    }

    public static Set<HeavlyBody> getMoonSet(Map<String, HeavlyBody> inMap) {
        Set<HeavlyBody> moonSet = new HashSet<>();
        for (String key: inMap.keySet()) {
            moonSet.addAll(inMap.get(key).getSatellites());
        }
        return moonSet;
    }

    // print all objects in hashmap
    public static void printObjects(Map<String, HeavlyBody> inMap) {
        for (String str :
                inMap.keySet()) {
            System.out.println(str);
        }
    }
    
    public static void iterateOverSet(Set<HeavlyBody> mySet) {
        Iterator<HeavlyBody> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            HeavlyBody temp = iterator.next();
            System.out.println(temp.getName());
            Set<HeavlyBody> iterator1 = temp.getSatellites();
            for (HeavlyBody tempmoon :
                   iterator1 ) {
                System.out.println("\t" + tempmoon.getName());
            }

        }
    }
}
