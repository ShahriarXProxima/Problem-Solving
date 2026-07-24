import java.util.Arrays;
import java.util.Scanner;

public class AngryMonk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            int[] potatoes = new int[k];
            for (int i = 0; i < k; i++) {
                potatoes[i] = input.nextInt();
            }
            Arrays.sort(potatoes);

            int totalOps = 0;
            for (int i = 0; i < k - 1; i++) {
                totalOps += (2 * potatoes[i] - 1);
            }

            System.out.println(totalOps);
        }
    }

}
