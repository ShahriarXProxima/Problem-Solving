import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = input.nextInt();
        }

        int count = 0;
        int maxPoint = points[0];
        int minPoint = points[0];

        if (points.length == 1) {
            System.out.print(count);
        } else {
            for (int i = 0; i < n; i++) {
                if (maxPoint < points[i]) {
                    count++;
                    maxPoint = points[i];
                } else if (minPoint > points[i]) {
                    count++;
                    minPoint = points[i];
                }
            }
            System.out.print(count);
        }
    }
}
