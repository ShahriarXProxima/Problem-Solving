import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LinearKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String alphabet = input.next();
            String word = input.next();

            Map<Character, Integer> keyMap = new HashMap<>();
            for (int i = 0; i < alphabet.length(); i++) {
                keyMap.put(alphabet.charAt(i), i + 1);
            }

            int sum = 0;
            for (int i = 0; i < word.length() - 1; i++) {
                sum += Math.abs(keyMap.get(word.charAt(i)) - keyMap.get(word.charAt(i + 1)));
            }
            System.out.println(sum);
        }
    }
}
