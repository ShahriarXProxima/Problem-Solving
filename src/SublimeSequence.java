import java.util.Scanner;

public class SublimeSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = input.nextInt();
            int n = input.nextInt();

            if (n % 2 != 0) {
                System.out.println(x);
            } else {
                System.out.println(0);
            }
        }
    }
}
