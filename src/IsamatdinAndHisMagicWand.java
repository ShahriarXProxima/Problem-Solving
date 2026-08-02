import java.util.Arrays;
import java.util.Scanner;

public class IsamatdinAndHisMagicWand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] toys = new int[n];
            boolean[] check = new boolean[n];
            Arrays.fill(check, true);

            for (int i = 0; i < n; i++) {
                toys[i] = input.nextInt();
                check[i] = toys[i] % 2 == 0;
            }


            boolean hasEven = false;
            boolean hasOdd = false;
            for (int i = 0; i < n; i++) {
                if (check[i]) {
                    hasEven = true;
                } else {
                    hasOdd = true;
                }
            }

            if (hasEven && hasOdd) {
                Arrays.sort(toys);
                for (int x : toys) {
                    System.out.print(x + " ");
                }
            } else {
                for (int x : toys) {
                    System.out.print(x + " ");
                }
            }

            System.out.println();
        }

    }
}
