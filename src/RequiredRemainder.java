import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();

            int z = (n / x) * x;
            int requiredReminder = z + y;
            if (requiredReminder > n) {
                requiredReminder -= x;
            }
            System.out.println(requiredReminder);
        }
    }
}
