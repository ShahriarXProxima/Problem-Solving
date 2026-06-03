import java.util.ArrayList;
import java.util.Scanner;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = n; i >= 1; i--) {
                list.add(i);
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == i + 1) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }

            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
