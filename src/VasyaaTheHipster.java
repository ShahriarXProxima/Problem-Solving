import java.util.Scanner;

public class VasyaaTheHipster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int red = input.nextInt();
        int blue = input.nextInt();

        int differentSocks = Math.min(red, blue);
        int remainingSocks = Math.max(red, blue) - differentSocks;
        int sameSocks = remainingSocks / 2;

        System.out.print(differentSocks + " " + sameSocks);
    }
}
