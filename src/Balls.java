import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] balls = new int[n];
        Map<Integer, Integer> ballMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            balls[i] = input.nextInt();
            ballMap.put(balls[i], ballMap.getOrDefault(balls[i], 0) + 1);
        }

        int key = 0;
        for (Map.Entry<Integer, Integer> entry : ballMap.entrySet()) {
            if (entry.getValue() >= 2) {
                key = entry.getKey();
                break;
            }
        }

        int firstIdx = 0;
        int secondIdx = 0;

        for (int i = 0; i < n; i++) {
            if (balls[i] == key) {
                firstIdx = i;
                break;
            }
        }

        for (int i = firstIdx + 1; i < n; i++) {
            if (balls[i] == key) {
                secondIdx = i;
                break;
            }
        }

        System.out.println(secondIdx - firstIdx);
    }
}
