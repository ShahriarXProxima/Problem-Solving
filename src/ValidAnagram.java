import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        return sort(s).equals(sort(t));
    }

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
