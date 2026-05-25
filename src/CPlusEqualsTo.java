import java.util.Scanner;

public class CPlusEqualsTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            int count = 0;
            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
