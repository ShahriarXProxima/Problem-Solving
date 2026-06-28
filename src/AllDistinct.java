import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllDistinct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            Set<Integer> unique = new HashSet<>();

            for (int i = 0; i < n; i++) {
                unique.add(input.nextInt());
            }

            int distinctSize = unique.size();

            if ((n - distinctSize) % 2 != 0) {
                System.out.println(distinctSize - 1);
            } else {
                System.out.println(distinctSize);
            }
        }
    }
}
