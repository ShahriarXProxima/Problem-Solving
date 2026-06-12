import java.util.Scanner;

public class BePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int zeroCount = 0;
            int negativeCount = 0;

            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                if (num == 0) {
                    zeroCount++;
                } else if (num == -1) {
                    negativeCount++;
                }
            }

            if (negativeCount % 2 == 0) {
                System.out.println(zeroCount);
            } else {
                System.out.println(zeroCount + 2);
            }
        }
    }
}
