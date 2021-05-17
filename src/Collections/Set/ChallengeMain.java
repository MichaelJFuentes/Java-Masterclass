package Collections.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ChallengeMain {
    public static void main(String[] args) {
        MiniMe rover = new MiniMe("Rover");
        MiniChallenge rover2 = new MiniChallenge("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

        ArrayList<Integer> myInts = new ArrayList<>();
        myInts.add(-4);
        myInts.add(-1);
        myInts.add(0);
        myInts.add(3);
        myInts.add(10);

        ArrayList<Integer> out = getMyInts(myInts);

        for (int i :
                out) {
            System.out.println(i);
        }

        System.out.println();
        int[] myArray = {-4,-1,0,3,10};

        int[] values = powerSort(myArray);

        for (int value :
                values) {
            System.out.println(value);
        }


    }

    public static ArrayList<Integer> getMyInts(ArrayList<Integer> inInts) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int i : inInts) {
            out.add((int)Math.pow(i,2));
        }
        Collections.sort(out);
        return out;
    }

    public static int[] powerSort(int[] in) {
        int start = 0;
        int end = in.length - 1;
        int index = end;
        int[] out = new int[in.length];

        while (start < end) {
            if (Math.abs(in[start]) > Math.abs(in[end])) {
                out[index] = in[start] * in[start];
                start++;
            } else {
                out[index] = in[end] * in[end];
                end--;
            }
            index--;
        }
        return out;
    }
}
