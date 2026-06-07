import java.util.Scanner;

public class IchihimeAndTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();
            long d = input.nextLong();

            System.out.println(b + " " + c + " " + c);
        }
    }
}
