import java.util.ArrayList;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, count = 0;
        n = input.nextInt();
        k = input.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                continue;
            } else if (arr.get(i) >= arr.get(k-1)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
