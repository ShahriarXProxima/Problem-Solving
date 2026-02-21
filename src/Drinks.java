import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double oranges = 0;

        for (int i = 1; i <= n; i++) {
            oranges += input.nextDouble();
        }
        System.out.print(oranges / n);
    }
}
