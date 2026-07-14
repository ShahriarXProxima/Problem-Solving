import java.util.Scanner;

public class NikitaAndBooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            long[] stack = new long[n];
            for (int i = 0; i < n; i++) {
                stack[i] = input.nextLong();
            }

            boolean isPossible = true;
            long needed = 1;

            for (int i = 0; i < n; i++) {
                if (stack[i] < needed) {
                    isPossible = false;
                    break;
                }

                long extra = stack[i] - needed;
                if (i + 1 < n) {
                    stack[i + 1] += extra;
                }
                needed++;
            }

            System.out.println(isPossible ? "YES" : "NO");
        }
    }
}
