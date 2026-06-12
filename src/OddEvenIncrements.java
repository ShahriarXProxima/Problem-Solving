import java.util.Scanner;

public class OddEvenIncrements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            boolean flag = true;

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            for (int i = 2; i < n; i++) {
                if (arr[i] % 2 != arr[i - 2] % 2) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
