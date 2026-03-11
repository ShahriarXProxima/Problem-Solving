import java.util.Arrays;
import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        int[] position = new int[4];

        while (test-- > 0) {
            for (int i = 0; i < 4; i++) {
                position[i] = input.nextInt();
            }

            int timur = position[0];
            Arrays.sort(position);
            int idx = 0;
            for (int i = 0; i < 4; i++) {
                if (position[i] == timur) {
                    idx = i;
                    break;
                }
            }
            System.out.println(4 - (idx+1));
        }
    }
}