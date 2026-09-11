import java.util.Scanner;

public class LineBreaks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();

            int current_len = 0;
            boolean stop = false;
            int x = 0;
            while (n-- > 0) {
                String word = input.next();
                if (!stop && current_len + word.length() <= m) {
                    current_len += word.length();
                    x++;
                    continue;
                }
                stop = true;
            }
            System.out.println(x);
        }
    }
}
