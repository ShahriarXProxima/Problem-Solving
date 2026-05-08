import java.util.ArrayList;
import java.util.Scanner;

public class Osumania {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            ArrayList<Integer> notes = new ArrayList<>();

            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                String rhythm = input.next();
                for (int j = 0; j < 4; j++) {
                    if (rhythm.charAt(j) == '#') {
                        notes.add(j + 1);
                    }
                }
            }

            for (int i = notes.size() - 1; i >= 0; i--) {
                System.out.print(notes.get(i) + " ");
            }
            System.out.println();

        }
    }
}
