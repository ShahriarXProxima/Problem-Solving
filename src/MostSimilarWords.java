import java.util.Scanner;

public class MostSimilarWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            String[] strArray = new String[n];
            for (int i = 0; i < n; i++) {
                strArray[i] = input.next();
            }

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int opt = 0;

                    for (int k = 0; k < m; k++) {
                        opt += Math.abs(
                                strArray[i].charAt(k) - strArray[j].charAt(k)
                        );
                    }

                    min = Math.min(min, opt);
                }
            }

            System.out.println(min);
        }
    }
}
