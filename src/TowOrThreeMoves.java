import java.util.Scanner;

public class TowOrThreeMoves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            if (n == 1) {
                System.out.println(2);
            } else if (n % 3 == 0) {
                System.out.println(n / 3);
            } else {
                System.out.println(n / 3 + 1);
            }
        }
    }
}
