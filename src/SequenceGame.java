import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] sequence = new int[n];

            for (int i = 0; i < n; i++) {
                sequence[i] = input.nextInt();
            }

            ArrayList<Integer> constructedSequence = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i > 0 && sequence[i - 1] > sequence[i]) {
                    constructedSequence.add(sequence[i]);
                }
                constructedSequence.add(sequence[i]);
            }

            System.out.println(constructedSequence.size());
            for (int i = 0; i < constructedSequence.size(); i++) {
                System.out.print(constructedSequence.get(i) + " ");
            }
            System.out.println();
        }
    }
}
