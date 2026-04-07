import java.util.Arrays;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n + 1];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] == arr[i + 1]) {
                    flag = false;
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
