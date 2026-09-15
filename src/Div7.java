import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n % 7 == 0) {
                System.out.println(n);
                continue;
            }

            int back = n, forth = n;
            while (back % 7 != 0 && forth % 7 != 0) {
                back--;
                forth++;
                n = Math.min(back, forth);
            }
            System.out.println(n);
        }
    }
}
