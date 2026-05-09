import java.util.Scanner;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int sum = 0;

            for (int i = 0; i < n - 1; i++) {
                sum += input.nextInt();
            }
            System.out.println(-sum);
        }
    }
}
