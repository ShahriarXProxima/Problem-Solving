import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> arrMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                arrMap.put(arr[i], arrMap.getOrDefault(arr[i], 0) + 1);
            }

            boolean flag = false;
            for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
                if (entry.getValue() >= 3) {
                    System.out.println(entry.getKey());
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}
