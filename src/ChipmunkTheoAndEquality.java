// HAVE FATAL FLAW, DO NOT COPY IT
import java.util.*;

public class ChipmunkTheoAndEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            int count = 0;
            while (!isEqual(arr)) {
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        arr[i] = arr[i] / 2;
                    } else {
                        arr[i]++;
                    }
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean isEqual(int[] arr) {
        if (arr.length <= 1) return true;

        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstElement) {
                return false;
            }
        }
        return true;
    }
}
