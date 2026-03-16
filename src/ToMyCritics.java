import java.util.Arrays;
import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] num = new int[3];
            for (int i = 0; i < 3; i++) {
                num[i] = input.nextInt();
            }
            Arrays.sort(num);

            if (num[2] + num[1] >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
