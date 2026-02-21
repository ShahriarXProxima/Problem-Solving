import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String currentMagnet = input.nextLine();
        String previousMagnet = currentMagnet;
        int countGroup = 0;

        while (n-- > 0) {
            currentMagnet = input.nextLine();
            if (currentMagnet.compareTo(previousMagnet) == 0) {
                continue;
            }
            countGroup++;
            previousMagnet = currentMagnet;
        }
        System.out.print(countGroup);
    }
}
