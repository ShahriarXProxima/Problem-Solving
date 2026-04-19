import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = n / 2;
        System.out.println(k);

        if (n % 2 == 0) {
            for (int i = 1; i <= k; i++) {
                System.out.print(2 + " ");
            }
        } else {
            for (int i = 1; i < k; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(3);
        }
    }
}
