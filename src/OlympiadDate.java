import java.util.Scanner;

public class OlympiadDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] digit = new int[10];
            int answer = 0;

            for (int i = 0; i < n; i++) {
                int x = input.nextInt();
                digit[x]++;

                if (digit[0] >= 3 &&
                        digit[1] >= 1 &&
                        digit[2] >= 2 &&
                        digit[3] >= 1 &&
                        digit[5] >= 1) {

                    if (answer == 0) {
                        answer = i + 1;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
