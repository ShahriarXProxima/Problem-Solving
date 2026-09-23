import java.util.Scanner;

public class PrintAPedestal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int base = n / 3;
            int rem = n % 3;

            int h1, h2, h3;

            if (rem == 0) {
                h1 = base + 1;
                h2 = base;
                h3 = base - 1;
            } else if (rem == 1) {
                h1 = base + 2;
                h2 = base;
                h3 = base - 1;
            } else {
                h1 = base + 2;
                h2 = base + 1;
                h3 = base - 1;
            }

            System.out.println(h2 + " " + h1 + " " + h3);


        }
    }
}
