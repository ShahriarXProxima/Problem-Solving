import java.util.Scanner;

public class PrintAPedestal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int h2 = 2;
            int h3 = 1;
            int h1 = n - (h2 + h3);

            System.out.println(h2 + " " + h1 + " " + h3);
        }
    }
}
