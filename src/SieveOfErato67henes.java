import java.util.HashSet;
import java.util.Scanner;

public class SieveOfErato67henes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            HashSet<Integer> set = new HashSet<>();

            for (int i = 1; i <= n; i++) {
                set.add(input.nextInt());
            }

            if (set.contains(67)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
