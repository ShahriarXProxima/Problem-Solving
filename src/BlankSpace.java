import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            int maxLength = 0;
            int currentLength = 0;
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();

                if (num == 0) {
                    currentLength++;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    currentLength = 0;
                }
            }
            System.out.println(maxLength);
        }
    }
}
