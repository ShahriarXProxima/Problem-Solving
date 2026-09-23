import java.util.Arrays;
import java.util.Scanner;

public class Riptide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] arr = new int[3];
            int gameRound = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);

            if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
                System.out.println(0);
                continue;
            }
            gameRound = arr[2] - arr[1];
            System.out.println(gameRound);
        }
    }
}
