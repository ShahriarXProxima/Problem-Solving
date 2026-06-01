import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            for (int i = 0; i < 2 * n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < 2 * n; j++) {
                    if ((i / 2 + j / 2) % 2 == 0) {
                        row.append('#');
                    } else {
                        row.append('.');
                    }
                }
                System.out.println(row);
            }
        }
    }
}