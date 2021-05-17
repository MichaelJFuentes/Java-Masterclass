package InputAndOutput;

import java.util.ArrayList;

public class OwnString {
    private char[] myChars;

    public OwnString(char[] myChars) {
        this.myChars = myChars;
    }

    public OwnString(String inString) {
        this.myChars = inString.toCharArray();
    }

    public String getString() {
        return String.valueOf(this.myChars);
    }

    public int indexOf(char c) {
        int index = -1;
        for (int i = 0; i < this.myChars.length ; i++) {
            if (this.myChars[i] == c) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int[] getIndexsOf(char c ) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < this.myChars.length; i++) {
            if (this.myChars[i] == c) {
                ints.add(i);
            }
        }
        int[] intArray = new int[ints.size()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ints.get(i);
        }
        return intArray;
    }

    public int lastIndex() {
        return this.myChars.length - 1;
    }
}
