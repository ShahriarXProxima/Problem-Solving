import java.util.Scanner;

public class AIProjectDevelopment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();

            int hourCountNoAI = 0;
            int locNoAI = 0;
            while (locNoAI < n) {
                locNoAI += (x + y);
                hourCountNoAI++;
            }

            int hourCountAI = 0;
            int locAI = 0;
            while (locAI < n) {
                hourCountAI++;
                if (hourCountAI <= z) {
                    locAI += x;
                } else {
                    locAI += (x + 10 * y);
                }
            }

            System.out.println(Math.min(hourCountNoAI, hourCountAI));
        }
    }
}
