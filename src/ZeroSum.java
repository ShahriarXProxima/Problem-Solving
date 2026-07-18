import java.util.Scanner;

public class ZeroSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int minus = 0, plus = 0;

            for (int i = 1; i <= n; i++) {
                int num = input.nextInt();
                if (num == 1) {
                    plus++;
                } else {
                    minus++;
                }
            }

            if (n % 2 == 0 && (plus < n && minus < n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
