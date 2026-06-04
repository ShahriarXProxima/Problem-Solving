import java.util.Scanner;

public class ThreePairwiseMaximums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long x = input.nextInt();
            long y = input.nextInt();
            long z = input.nextInt();

            if (x == y && x >= z) {
                System.out.println("YES");
                System.out.println(x + " " + z + " " + 1);
            } else if (x == z && x >= y) {
                System.out.println("YES");
                System.out.println(y + " " + x + " " + 1);
            } else if (y == z && y >= x) {
                System.out.println("YES");
                System.out.println(x + " " + 1 + " " + y);
            } else {
                System.out.println("NO");
            }
        }
    }
}
