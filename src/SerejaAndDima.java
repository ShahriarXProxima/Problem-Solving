import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = input.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;
        boolean serejaTurn = true;

        while (left <= right) {
            int chosen;
            if (points[left] > points[right]) {
                chosen = points[left++];
            } else {
                chosen = points[right--];
            }

            if (serejaTurn) {
                sereja += chosen;
            } else {
                dima += chosen;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.print(sereja + " " + dima);
    }
}
