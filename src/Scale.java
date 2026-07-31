import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            StringBuilder output = new StringBuilder();

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                grid[i] = input.next();
            }

            for (int i = 0; i < n; i += k) {
                for (int j = 0; j < n; j += k) {
                    output.append(grid[i].charAt(j));
                }
                output.append('\n');
            }

            System.out.print(output);
        }
    }
}
