import java.util.Scanner;

public class TwoVessels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int maxCapacity = Math.max(a, b);
            int minCapacity = Math.min(a, b);
            int moves = 0;

            while (maxCapacity > minCapacity) {
                maxCapacity -= c;
                minCapacity += c;
                moves++;
            }
            System.out.println(moves);
        }
    }
}
