import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = input.nextInt();
            min = Math.min(min, Math.abs(num));
        }

        System.out.println(Math.abs(min));
    }
}
