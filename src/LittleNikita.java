import java.util.Scanner;

public class LittleNikita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt(), m = input.nextInt();

            if (n >= m) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}
