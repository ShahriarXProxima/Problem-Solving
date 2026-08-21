import java.util.Scanner;

public class TurtleMathFastThreeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            boolean hasRem = false;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] % 3 == 1) {
                    hasRem = true;
                }
                sum += arr[i];
            }

            int rem = sum % 3;

            if (rem == 0) {
                System.out.println(0);
            } else if (rem == 2) {
                System.out.println(1);
            } else if (rem == 1) {
                if (hasRem) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
