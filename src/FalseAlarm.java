import java.util.Scanner;

public class FalseAlarm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();

            int[] gates = new int[n];
            for (int i = 0; i < n; i++) {
                gates[i] = input.nextInt();
            }

            int firstOne = -1;
            int lastOne = -1;
            for (int i = 0; i < n; i++) {
                if (gates[i] == 1) {
                    if (firstOne == -1) {
                        firstOne = i;
                    }
                    lastOne = i;
                }
            }

            int gap = (firstOne == -1) ? 0 : (lastOne - firstOne);

            if (gap < x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
