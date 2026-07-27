import java.util.Scanner;

public class IAmBoredWithLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt();
        System.out.println(getFact(Math.min(a,b)));
    }

    public static int getFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFact(n - 1);
    }
}
