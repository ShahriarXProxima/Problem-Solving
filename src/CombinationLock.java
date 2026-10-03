import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String current = input.next();
        String original = input.next();

        int moves = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs((current.charAt(i) - '0') - (original.charAt(i) - '0'));
            moves += Math.min(diff, 10 - diff);
        }

        System.out.println(moves);
    }
}
