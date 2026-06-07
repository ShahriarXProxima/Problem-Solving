import java.util.Scanner;

public class SystemOfEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int count = 0;
        for (int a = 0; a * a <= n; a++) {
            int b = n - a * a;
            if (a + b * b == m) {
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
