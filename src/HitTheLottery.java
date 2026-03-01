import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int billCount = 0;

        billCount += n / 100;
        n %= 100;

        billCount += n / 20;
        n %= 20;

        billCount += n / 10;
        n %= 10;

        billCount += n / 5;
        n %= 5;

        billCount += n;

        System.out.print(billCount);

    }
}
