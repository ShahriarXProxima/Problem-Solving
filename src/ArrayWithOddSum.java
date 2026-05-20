import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int sum = 0;
            int oddCount = 0;
            int evenCount = 0;

            for (int i = 0; i < n; i++) {
                int val = input.nextInt();
                sum += val;

                if (val % 2 != 0) {
                    oddCount++;
                } else {
                    evenCount++;
                }
            }

            if (sum % 2 != 0 || (oddCount > 0 && evenCount > 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}