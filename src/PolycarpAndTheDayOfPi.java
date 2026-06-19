import java.util.Scanner;

public class PolycarpAndTheDayOfPi {
    private static final String pi = "3141592653589793238462643383279";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String userPI = input.next();
            int correctRememberCount = 0;
            for (int i = 0; i < userPI.length(); i++) {
                if (userPI.charAt(i) == pi.charAt(i)) {
                    correctRememberCount++;
                    continue;
                }
                break;
            }
            System.out.println(correctRememberCount);

        }
    }
}
