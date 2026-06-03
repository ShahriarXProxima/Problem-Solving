import java.util.Scanner;

public class PerfectRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + (i == n ? "" : " "));
            }
            System.out.println();
        }
    }
}
