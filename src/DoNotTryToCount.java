import java.util.Scanner;

public class DoNotTryToCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();

            String x = input.next();
            String s = input.next();

            int operations = 0;
            boolean found = false;

            while (x.length() < 2 * m) {
                if (x.contains(s)) {
                    found = true;
                    break;
                }
                x = x + x;
                operations++;
            }

            if (!found && x.contains(s)) {
                found = true;
            }

            if (found) {
                System.out.println(operations);
            } else {
                System.out.println(-1);
            }
        }
    }
}
