import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            int p = d - b;
            int q = p - (c - a);

            if (p >= 0 && q >= 0) {
                System.out.println(p + q);
                continue;
            }
            System.out.println(-1);
        }
    }
}
