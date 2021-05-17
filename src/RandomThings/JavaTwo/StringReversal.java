package RandomThings.JavaTwo;

public class StringReversal {
    public static void main(String[] args) {
        String in = "12345";
        int start = 0;
        int end = in.length() - 1;
        char[] out = new char[end + 1];
        while (true) {
            out[start] = in.charAt(end);
            out[end] = in.charAt(start);
            start++;
            end--;

            if (start > end) {
                break;
            }
        }

        System.out.println(out);
    }
}
