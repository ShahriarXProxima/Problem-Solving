import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            int[] arr = new int[n];
            boolean isPossible = false;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] == k) {
                    isPossible = true;
                }
            }
            if (isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
