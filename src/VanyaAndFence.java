import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), h = input.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

            if (arr[i] > h) {
                count += 2;
            } else {
                count++;
            }
        }
        System.out.print(count);
    }
}
