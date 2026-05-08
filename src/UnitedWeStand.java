import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            int m = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                m = Math.min(m, a[i]);
            }

            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i] == m) {
                    b.add(a[i]);
                    continue;
                }
                c.add(a[i]);
            }

            if (c.isEmpty() || b.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());

                for (int k : b) {
                    System.out.print(k + " ");
                }
                System.out.println();
                for (int k : c) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}

