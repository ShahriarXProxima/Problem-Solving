import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            int plusCount = 0;
            int minusCount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    minusCount++;
                } else {
                    plusCount++;
                }
            }

            int opt = 0;
            while (minusCount > plusCount) {
                minusCount--;
                plusCount++;
                opt++;
            }

            if (minusCount % 2 != 0) {
                opt++;
            }

            System.out.println(opt);
        }
    }
}
