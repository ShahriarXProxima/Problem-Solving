import java.util.Scanner;

public class RobinHelps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            int[] treasure = new int[n];
            for (int i = 0; i < n; i++) {
                treasure[i] = input.nextInt();
            }

            int people = 0;
            int remainingGold = 0;
            for (int i = 0; i < n; i++) {
                if (treasure[i] >= k) {
                    remainingGold += treasure[i];
                }
                if (treasure[i] == 0 && remainingGold > 0) {
                    people++;
                    remainingGold--;
                }
            }
            System.out.println(people);
        }
    }
}
