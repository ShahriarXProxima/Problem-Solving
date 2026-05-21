import java.util.Scanner;

public class AForbiddenInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int x = input.nextInt();

            // Division and Remainder checking (when x != 1)
            if (x != 1) {
                System.out.println("YES");

                int divisor = (k == x) ? k - 1 : k;
                int q = n / divisor;
                int r = n % divisor;

                if (r == 0) {
                    System.out.println(q);
                    for (int i = 0; i < q; i++) {
                        System.out.print(divisor + " ");
                    }
                } else if (r == x) {
                    System.out.println(q + 2);
                    for (int i = 0; i < q; i++) {
                        System.out.print(divisor + " ");
                    }
                    System.out.print((r - 1) + " " + 1 + " ");
                } else {
                    System.out.println(q + 1);
                    for (int i = 0; i < q; i++) {
                        System.out.print(divisor + " ");
                    }
                    System.out.print(r + " ");
                }
                System.out.println();

            }
            // Added 'k >= 2' to make sure we are actually allowed to use 2
            else if (n % 2 == 0 && k >= 2) {
                System.out.println("YES");
                System.out.println(n / 2);
                for (int i = 0; i < n / 2; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println();

            } else if (k >= 3) {
                System.out.println("YES");
                System.out.println(1 + (n - 3) / 2);
                System.out.print(3 + " ");
                for (int i = 0; i < (n - 3) / 2; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println();

            } else {
                System.out.println("NO");
            }
        }
    }
}