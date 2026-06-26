import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] notes = new int[n];
            for (int i = 0; i < n; i++) {
                notes[i] = input.nextInt();
            }

            boolean flag = true;
            for (int i = 0; i < n - 1; i++) {
                int a = notes[i];
                int b = notes[i + 1];

                if (Math.abs(a - b) == 5 || Math.abs(a - b) == 7) {
                    continue;
                }
                flag = false;
                break;
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
