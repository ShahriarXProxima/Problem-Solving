import java.util.Scanner;

public class NewWorldNewMeNewArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int p = input.nextInt();

            int abs_k = Math.abs(k);

            if (abs_k > n * p) {
                System.out.println(-1);
                continue;
            }

            int ans = (abs_k + p - 1) / p;
            System.out.println(ans);

        }
    }
}
