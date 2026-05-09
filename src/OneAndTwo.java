import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            int totalsTwos = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] == 2) {
                    totalsTwos++;
                }
            }

            if (totalsTwos % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int prefixTwos = 0;
            int targetTwos = totalsTwos / 2;
            int k = -1;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 2) {
                    prefixTwos++;
                }

                if (prefixTwos == targetTwos) {
                    k = i + 1;
                    break;
                }
            }

            System.out.println(k);
        }
    }
}
