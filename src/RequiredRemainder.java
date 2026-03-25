import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();

            int remainder = y % x;
            int requiredReminder = 0;
            for (int i = n; i >= 0; i--) {
                if ((i % x) == remainder) {
                    requiredReminder = i;
                    break;
                }
            }
            System.out.println(requiredReminder);
        }
    }
}
