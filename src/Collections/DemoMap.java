package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a complied high level, orbject-oriented, platform independant language" );
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        System.out.println(languages.getOrDefault("Python", "Key not found"));
        System.out.println(languages.putIfAbsent("C#", "Java Clone"));  // what would be the output

        System.out.println(languages.get("C#"));
        // get array of keys
        Set<String> myKeys = languages.keySet();
        for (String key :
                myKeys) {
            System.out.println(key + " --> " + languages.get(key));
        }
        // get array of values
        Collection<String> myValues = languages.values();

        // can multiple values be assigned to one key
        languages.put("Python", "My first language");
        System.out.println(languages.get("Python")); // what would be the output

        // how to create a dictionary with multiple values per key

        // how to clear a hashmap
        //languages.clear();
        for (String key :
                languages.keySet()) {
            System.out.println(languages.get(key));
        }
        if (languages.isEmpty()) {
            System.out.println("hashMap is empty");
        }
        // how to merege two hashmaps

        HashMap<String, String> hashTwo = new HashMap<>();
        hashTwo.put("Intel", "Old man on the block");
        hashTwo.put("AMD", "Rising star");

        for (String key :
                hashTwo.keySet()) {
            System.out.println(key + " --> " + hashTwo.get(key));
        }


        System.out.println();
        languages.putAll(hashTwo);

        for (String key :
                languages.keySet()) {
            System.out.println(key + " --> " + languages.get(key));
        }

        System.out.println();

        HashMap<String, String> copy = new HashMap<>(languages);

        System.out.println(languages.size());

        // can you sort keys


        // removing key value pair
        //languages.remove("AMD");

        languages.replace("AMD", "The only 7nm CPU manufacture");
        System.out.println(languages.get("AMD"));
    }
}
