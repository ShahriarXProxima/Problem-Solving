import java.util.Arrays;
import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "codeforces";
        char[] codeforces = str.toCharArray();

        int test = input.nextInt();
        while (test-- > 0) {
            String word = input.next();
            char[] wordArray = word.toCharArray();
            int count = 0;

            for (int i = 0; i < 10; i++) {
                if (wordArray[i] != codeforces[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
