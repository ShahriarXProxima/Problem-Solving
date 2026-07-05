import java.util.Scanner;

public class LittleNikita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt(), m = input.nextInt();

            if (n >= m && (n - m) % 2 == 0) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}
