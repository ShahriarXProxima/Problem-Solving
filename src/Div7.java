import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            int back = n;
            int forth = n;

            while (back % 7 != 0) {
                back--;
            }

            while (forth % 7 != 0) {
                forth++;
            }

            if (n - back < forth - n) {
                System.out.println(back);
            } else {
                System.out.println(forth);
            }
        }
    }
}
