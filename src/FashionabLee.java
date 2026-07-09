import java.util.Scanner;

public class FashionabLee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n % 4 == 0) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}
