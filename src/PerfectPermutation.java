import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if (n % 2 != 0) {
            System.out.println(-1);
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
