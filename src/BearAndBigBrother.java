import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = 0;
        int limak, bob;
        limak = input.nextInt();
        bob = input.nextInt();

        while (true) {
            limak *= 3;
            bob *= 2;
            year++;
            if (limak > bob) {
                break;
            }
        }
        System.out.print(year);
    }
}
