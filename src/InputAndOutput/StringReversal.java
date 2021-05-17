package InputAndOutput;

import java.util.ArrayList;
import java.util.Random;

public class StringReversal {
    public static String reverseString(String ogString) {
        StringBuilder newString = new StringBuilder();
        for (int i = ogString.length() -1 ; i >= 0; i--) {
            newString.append(ogString.charAt(i));
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String og = "Hello World";
        System.out.println(reverseString(og));
        System.out.println(compareAtNthPoint("Hello", "Mello", 1));
        for (int i = 0; i < 20; i++) {
            System.out.println(generateSentence());
        }
        System.out.println();
        System.out.println(tokenizing("some words that do not begging with the letter b best of bath time"));
        System.out.println(tokenizingEnd("somed words ending with -ed how about that new stuff ed edgar"));
        System.out.println();
        for (int i = 0; i < 256; i++) {
            System.out.println(intToChar(i));
        }

        System.out.println();
        OwnString ownString = new OwnString(new char[]{'j', 's', 'e', 's'});
        System.out.println(ownString.lastIndex());
        System.out.println(ownString.indexOf('s'));
        System.out.println(ownString.getString());

    }
    public static boolean compareStrings(String stringOne, String stringTwo) {
        int cmt = stringOne.compareTo(stringTwo);
        return cmt == 0;
    }

    public static String appendString(String one, String two) {
        return one + two;
    }

    public static int lengthOfString(String string) {
        return string.length();
    }

    public static boolean compareAtNthPoint(String stringOne, String stringTwo, int startingPoint) {
        int cmt =  stringOne.substring(startingPoint).compareToIgnoreCase(stringTwo.substring(startingPoint));
        return cmt == 0;
    }

    public static String generateSentence() {
        Random random = new Random();
        final int BOUND = 5;
        String string = "the a once some any";
        String[] articels = string.split(" ");
        string = "boy girl dog town car";
        String[] nouns = string.split(" " );
        string = "drove jumped ran walked skipped";
        String[] verbs = string.split(" ");
        string = "to from over under on";
        String[] preposition = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(articels[random.nextInt(BOUND)]);
        stringBuilder.append(" ");
        stringBuilder.append(nouns[random.nextInt(BOUND)]);
        stringBuilder.append(" ");
        stringBuilder.append(verbs[random.nextInt(BOUND)]);
        stringBuilder.append(" "    );
        stringBuilder.append(preposition[random.nextInt(BOUND)]);
        stringBuilder.append(".");
        stringBuilder.replace(0,1, String.valueOf(stringBuilder.charAt(0)).toUpperCase());
        return stringBuilder.toString();
    }

    public static String tokenizing(String string) {
        String[] stringArray = string.split(" " );
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            char c = stringArray[i].charAt(0);
            if (c == 'b' || c == 'B') {
                stringBuilder.append(stringArray[i]);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static String tokenizingEnd(String string) {
        String[] stringArray = string.split(" " );
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            String s = stringArray[i];
//            System.out.println(s);
//            System.out.println(s.substring(s.length() - 2));
            if (s.length() >= 2 && s.substring(s.length() - 2).equals("ed")) {
                stringBuilder.append(s);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static char intToChar(int number) {
        return (char)number;

    }
}
