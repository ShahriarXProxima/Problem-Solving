import java.util.Arrays;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] participants = new int[n];
            int[] participantsDemo = new int[n];

            for (int i = 0; i < n; i++) {
                participants[i] = input.nextInt();
                participantsDemo[i] = participants[i];
            }

            Arrays.sort(participantsDemo);
            for (int i = 0; i < n; i++) {
                if (participants[i] == participantsDemo[n - 1]) {
                    System.out.print(participants[i] - participantsDemo[n - 2] + " ");
                } else {
                    System.out.print(participants[i] - participantsDemo[n - 1]+" ");
                }
            }
            System.out.println();
        }
    }
}
