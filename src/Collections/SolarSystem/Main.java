package Collections.SolarSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    public static void main(String[] args) {

        // add planets and moons
        Planet tempPlanet = new Planet("Mercury", 190);
        addHeavenlyBody(tempPlanet);
        tempPlanet = new Planet("Venus", 230);
        addHeavenlyBody(tempPlanet);
        tempPlanet = new Planet("Mars", 280);
        addHeavenlyBody(tempPlanet);
        Moon tempMoon = new Moon("Mars Moon", 56);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new Moon("Mars Moon 2" , 34);
        tempPlanet.addMoon(tempMoon);
        tempPlanet = new Planet("Earth", 365);
        tempMoon = new Moon("Earth Moon" , 29);
        tempPlanet.addMoon(tempMoon);
        addHeavenlyBody(tempPlanet);
        tempPlanet = new Planet("Jupiter", 450);
        tempMoon = new Moon("J-1", 32);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new Moon("J-2", 34);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new Moon("J-3", 345);
        tempPlanet.addMoon(tempMoon);
//        tempMoon = new Moon("Earth", 53);
//        tempPlanet.addMoon(tempMoon);
        addHeavenlyBody(tempPlanet);
        printSet(getMoonsTest());
        System.out.println("TEST ZONE ___________________________________/\\");
        printSet(solarSystem.keySet());
        System.out.println("++++++++++++++Union+++++++++++++++");
        printSet(union());
        System.out.println("+==============Moons==================+");
        printSet(getMoonSet());
        System.out.println("---------------Intersection---------------------");
        printSet(intersection());
        System.out.println("-------------Union - Moons-------------");
        printSet(relative(union(),getMoonSet()));
        System.out.println("-----------------A.equalB and B.equalA-------------------");
        Planet Earth = new Planet("Earth", 365);
        System.out.println(Earth.equals(solarSystem.get(Earth.getName())));
        System.out.println(solarSystem.get(Earth.getName()).equals(Earth));
        // print the union things
        detailPrint(union());


    }

    public static boolean addHeavenlyBody(HeavenlyBody object) {
        if (object == null) {
            return false;
        }
        if (solarSystem.keySet().contains(object.getName())) {
            HeavenlyBody temp = solarSystem.get(object.getName());
            if (temp.getType() != object.getType()) {
                solarSystem.put(object.getName(), object);
                return true;
            }
            return false;
        }
        solarSystem.put(object.getName(), object);
        return true;
    }

    public static boolean removeHeavenlyBody(HeavenlyBody object) {
        if (object == null) {
            return false;
        }
        if (solarSystem.containsKey(object.getName())) {
            solarSystem.remove(object.getName());
            return true;
        }
        return false;
    }

    // print objects in set
    public static void printSet(Set<String> mySet) {
        for (String n :
                mySet) {
            System.out.println(n);
            //printMoons((Planet)solarSystem.get(n));
        }
    }

    // print moons of planet object
    public static void printMoons(Planet object) {
        for (HeavenlyBody moon : object.getMoons()) {
            System.out.println("\t" + moon.getName());
        }
    }

    // create a union of moons and planets and print them out
    public static Set<String> union() {
        Set<String> union = new HashSet<>(solarSystem.keySet());
        for (String n : solarSystem.keySet()) {
            // get moon set
            Set<HeavenlyBody> moons = ((Planet)solarSystem.get(n)).getMoons();
            for (HeavenlyBody moon : moons) {
                union.add(moon.getName());
            }
        }
        return union;
    }
    public static Map<String, HeavenlyBody> unionMap() {
        Map<String ,HeavenlyBody> map = new HashMap<>();
        for (String planet : solarSystem.keySet()) {
            Planet temp = (Planet)solarSystem.get(planet);
            // add planet to list
            map.put(temp.getName(), temp);
            // add moons to set
            Set<HeavenlyBody> moon = temp.getMoons();
            for (HeavenlyBody tempMoon : moon) {
                map.put(tempMoon.getName(), tempMoon);

            }
        }
        return map;
    }

    public static void detailPrint(Set<String> set) {
        for (String e : set) {
            HeavenlyBody temp = solarSystem.get(e);
            if (temp == null) {
                continue;
            }
            System.out.println(temp);
        }
    }

    // build set of moons
    public static Set<String> getMoonSet() {
        Set<String> moons = new HashSet<>();
        for (String p :
                solarSystem.keySet()) {

            Set<HeavenlyBody> sat = ((Planet)solarSystem.get(p)).getMoons();
            for (HeavenlyBody h : sat) {
                moons.add(h.getName());
            }
        }
        return moons;
    }

    public static Set<String> getSetNames(Set<HeavenlyBody> bodies) {
        Set<String> names = new HashSet<>();
        for (HeavenlyBody item:
             bodies ) {
            names.add(item.getName());
        }
        return names;
    }

    public static Set<String> getPlanetNames() {
        return solarSystem.keySet();
    }

    public static Set<HeavenlyBody> getPlanets() {
        Set<HeavenlyBody> planets = new HashSet<>();
        for (String planet : getPlanetNames()) {
            planets.add(solarSystem.get(planet));
        }
        return planets;
    }
    // method to get the diff
    public static Set<String> intersection() {
        Set<String> intersection = new HashSet<>(union());
        intersection.retainAll(getMoonSet());
        return intersection;
    }

    public static Set<String> relative(Set<String> A, Set<String> B) {
        Set<String> r = new HashSet<>(A);
        r.removeAll(B);
        return r;
    }

    public static Set<String> getMoonsTest() {
        Set<String> returnSet = new HashSet<>();
        for (String key :
                solarSystem.keySet()) {
            Planet temp = (Planet)solarSystem.get(key);
            System.out.println("Planet Name: " + temp.getName());
            Set<HeavenlyBody> tempMoons = temp.getMoons();
            if (tempMoons == null || tempMoons.isEmpty()) {
                System.out.println("\tNo moons present");
            } else {
                for (HeavenlyBody moon : tempMoons) {
                    System.out.println("\t" + moon);
                    returnSet.add(moon.getName());
                }
            }
        }
        return returnSet;
    }


}
