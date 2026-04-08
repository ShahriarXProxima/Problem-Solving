import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int count1 = 0, count2 = 0;
            for (int i = 0; i < n; i++) {
                if (input.nextInt() == 1) count1++;
                else count2++;
            }

            if (count1 % 2 != 0) {
                System.out.println("NO");
            } else if (count1 == 0 && count2 % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}