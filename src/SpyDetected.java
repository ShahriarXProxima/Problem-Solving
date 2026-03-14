import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            int idx = 0;
            if (arr[0] != arr[1]) {
                if (arr[0] != arr[2]) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                for (int i = 2; i < n; i++) {
                    if (arr[i] != arr[0]) {
                        idx = i + 1;
                        break;
                    }
                }
                System.out.println(idx);
            }
        }
    }
}
