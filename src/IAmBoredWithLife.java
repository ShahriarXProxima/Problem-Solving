import java.util.Scanner;

public class IAmBoredWithLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt();
        System.out.println(getGcd(getFact(a), getFact(b)));
    }

    public static int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

    public static int getFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFact(n - 1);
    }
}
