import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = input.nextInt();
            }

            int x = a[0] + a[1];
            int y = a[2] - a[1];
            int z = a[3] - a[2];

            if (x == y && y == z) {
                System.out.println(3);
            } else if (x == y || y == z || z == x) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }
}
