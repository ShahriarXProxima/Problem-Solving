import java.util.Scanner;

public class WhoIsOpposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int half_n = Math.abs(a - b);
            int n = 2 * half_n;

            if (a > n || b > n || c > n) {
                System.out.println(-1);
            } else {
                if (c <= half_n) {
                    System.out.println(c + half_n);
                } else {
                    System.out.println(c - half_n);
                }
            }

        }
    }
}
