package Java;
import java.util.Scanner;

public class ReconnaissanceTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = input.nextInt();
        }

        int edge = Math.abs(arr[0] - arr[arr.length - 1]);
        int ans1 = 1, ans2 = n;

        for (int i = 0; i < n - 1; i++) {
            if (edge > Math.abs(arr[i] - arr[i + 1])) {
                edge = Math.abs(arr[i] - arr[i + 1]);
                ans1 = i + 1;
                ans2 = i + 2;
            }
        }
        System.out.println(ans1 + " " + ans2);

    }
}
