import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int l = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int p = input.nextInt();
        int nl = input.nextInt();
        int np = input.nextInt();

        int toastsFromDrink = (k * l) / (n * nl);
        int toastsFromLime = (c * d) / n;
        int toastsFromSalt = p / (n * np);

        int maxToasts = Math.min(toastsFromDrink, Math.min(toastsFromLime, toastsFromSalt));

        System.out.print(maxToasts);

    }
}
