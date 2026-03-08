import java.util.Scanner;

public class GameWithInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        for (int i = 1; i <= test; i++) {
            int integers = input.nextInt();

            if (integers % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
