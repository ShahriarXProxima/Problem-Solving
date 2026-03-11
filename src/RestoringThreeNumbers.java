import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sums = new int[4];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = input.nextInt();
        }
        Arrays.sort(sums);

        System.out.print((sums[3] - sums[2]) + " " + (sums[3] - sums[1]) + " " + (sums[3] - sums[0]));
    }
}
