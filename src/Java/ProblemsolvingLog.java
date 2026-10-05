package Java;
import java.util.Scanner;

public class ProblemsolvingLog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String log = input.next().toLowerCase();

            int[] hashLog = new int[26];
            for (int i = 0; i < log.length(); i++) {
                hashLog[log.charAt(i) - 'a']++;
            }

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (hashLog[i] >= i + 1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
