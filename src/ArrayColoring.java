import java.util.Arrays;
import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int odd = 0;

            for (int i = 0; i < n; i++) {
                int x = input.nextInt();
                if (x % 2 == 1) {
                    odd++;
                }
            }

            if (odd %2== 0) {
                System.out.println("YES");
            } else {
                {
                    System.out.println("NO");
                }
            }
        }
    }
}
