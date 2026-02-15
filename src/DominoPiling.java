import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        m = input.nextInt();
        n = input.nextInt();

        int maxDominos = (m * n) / 2;
        System.out.print(maxDominos);

    }
}
