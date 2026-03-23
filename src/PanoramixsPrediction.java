import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int prime = 0;
        for (int i = n + 1; i <= m; i++) {
            boolean found = true;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    found = false;
                    break;
                }
            }
            if (found) {
                prime = i;
                break;
            }

        }

        if (prime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
