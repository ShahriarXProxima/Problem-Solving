import java.util.ArrayList;
import java.util.Scanner;

public class RestoreThePermutationBYMerger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            ArrayList<Integer> permutation = new ArrayList<>();

            permutation.add(input.nextInt());
            for (int i = 1; i < n * 2; i++) {
                int num = input.nextInt();
                if (permutation.contains(num)) {
                    continue;
                }
                permutation.add(num);
            }

            for (int x : permutation) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
