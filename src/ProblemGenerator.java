import java.util.Scanner;

public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int round = input.nextInt();
            String problem = input.next();

            int[] count = new int[7];
            for (int i = 0; i < n; i++) {
                char ch = problem.charAt(i);
                count[ch - 'A']++;
            }

            int totalProblemNeeded = 0;
            for (int j : count) {
                if (j < round) {
                    totalProblemNeeded += round - j;
                }
            }
            System.out.println(totalProblemNeeded);
        }
    }
}
