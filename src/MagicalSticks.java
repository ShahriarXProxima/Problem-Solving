import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            double n = input.nextDouble();
            System.out.println((int) Math.round(n/2) );
        }
    }
}
