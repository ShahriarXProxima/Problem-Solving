import java.util.Scanner;

public class TenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int idx = 0;
            int previousQuality = Integer.MIN_VALUE;

            for (int i = 1; i <= n; i++) {
                int currentWords = input.nextInt();
                int currentQuality = input.nextInt();
                if (currentWords <= 10 && currentQuality > previousQuality) {
                    idx = i;
                }
                previousQuality = currentQuality;
            }
            System.out.println(idx);
        }
    }
}
