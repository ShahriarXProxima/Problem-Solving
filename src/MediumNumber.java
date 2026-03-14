import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
