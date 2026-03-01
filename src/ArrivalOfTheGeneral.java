import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] soldiers = new int[n];

        for (int i = 0; i < n; i++) {
            soldiers[i] = input.nextInt();
        }

        int maxPos = 0;
        for (int i = 1; i < n; i++) {
            if (soldiers[i] > soldiers[maxPos]) {
                maxPos = i;
            }
        }

        int minPos = 0;
        for (int i = 0; i < n; i++) {
            if (soldiers[i] <= soldiers[minPos]) {
                minPos = i;
            }
        }

        int swaps = maxPos + (n - 1 - minPos);
        if (maxPos > minPos) {
            swaps--;
        }

        System.out.println(swaps);
    }
}
