import java.util.Scanner;

public class PrefixMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                max = Math.max(max, input.nextInt());
            }
            System.out.println(max * n);
        }
    }
}
