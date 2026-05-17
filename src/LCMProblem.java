import java.util.Scanner;

public class LCMProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long l = input.nextInt();
            long r = input.nextInt();

            if (2 * l <= r) {
                System.out.println(l + " " + 2 * l);
            } else {
                System.out.println(-1 + " " + -1);
            }
        }
    }
}
