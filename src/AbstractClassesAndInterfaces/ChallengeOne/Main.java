package AbstractClassesAndInterfaces.ChallengeOne;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);
//    public static void main(String[] args) {
//        ArrayList<String> myArray = readData();
//        Player mike = new Player("Mike", 100,200);
//        System.out.println(mike);
//        saveObject(mike);
//        mike.setHitPoints(100);
//        saveObject(mike);
//        loadObject(mike);
//        System.out.println(mike);
//    }
//
//    public static ArrayList<String> readData() {
//        //boolean quit = false;
//        ArrayList<String> myArrayList = new ArrayList<String>();
//        // type quit to exit
//        System.out.print("enter your data or type quit to exit the program: ");
//        // ask first question
//        String userString = keyboard.nextLine();
//        while (!userString.equals("quit")) {
//            myArrayList.add(userString);
//            System.out.print("Enter your data: ");
//            userString = keyboard.nextLine();
//        }
//        return myArrayList;
//    }
//
//    public static void saveObject(Savable objectToSave) {
//        for (int i = 0; i < objectToSave.write().size(); i++) {
//            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device" );
//        }
//    }
//
//    public static void loadObject(Savable objectToLoad) {
//        ArrayList<String> values = readData();
//        objectToLoad.read(values);
//    }
    public static void main(String[] args) {
        List<String> myMonster = new ArrayList<String>();
        myMonster.add("Bob");
        myMonster.add(String.valueOf(100));
        myMonster.add(String.valueOf(10));

        Savable monster;
        monster = new Monster();
        System.out.println(monster);
        monster.read(myMonster);
        System.out.println(monster);

        List<String> monsterBack = new ArrayList<String>();
        monsterBack = monster.write();

        for (String element :
                monsterBack) {
            System.out.println(element);
        }

        System.out.println("Hit Points " + ((Monster) monster).getHitPoints());

    }
}
