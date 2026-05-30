import java.util.Scanner;

public class EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            int opt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                    opt++;
                } else if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                    opt++;
                }
            }

            System.out.println(opt);
        }
    }
}
