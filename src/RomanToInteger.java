import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);

        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = symbolMap.get(s.charAt(i));
            if (i < s.length() - 1 && current < symbolMap.get(s.charAt(i + 1))) {
                integer -= current;
            } else {
                integer += current;
            }

        }

        return integer;
    }
}
