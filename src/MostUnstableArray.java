import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long n = input.nextInt();
            long m = input.nextInt();

            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(m);
            } else {
                System.out.println(2 * m);
            }
        }
    }
}
