import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtillasFavoriteProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> alphabetMap = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            alphabetMap.put(alphabet.charAt(i), i + 1);
        }

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            char[] strArray = str.toCharArray();

            Arrays.sort(strArray);

            if (alphabetMap.containsKey(strArray[strArray.length - 1])) {
                System.out.println(alphabetMap.get(strArray[strArray.length - 1]));
            }
        }
    }
}
