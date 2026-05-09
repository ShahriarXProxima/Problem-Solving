import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int oddCounter = 0;

            for (int i = 1; i <= 2 * n; i++) {
                int num = input.nextInt();
                if (num % 2 != 0) {
                    oddCounter++;
                }
            }

            if (oddCounter == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
