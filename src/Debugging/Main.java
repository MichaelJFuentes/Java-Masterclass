package Debugging;

public class Main {
    public static void main(String[] args) {
        StringUtilties utils = new StringUtilties();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10  ) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);
        System.out.println(utils.getCharsAdded());

        String str = "abcdefg";
        String result = utils.upperAndPrefix(str);
        result = utils.addSuffix(result );
        System.out.println(result);
    }
}
