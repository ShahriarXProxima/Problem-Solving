import java.util.ArrayList;
import java.util.Scanner;

public class LongestGoodArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int l = input.nextInt();
            int r = input.nextInt();

            int track = 0;
            ArrayList<Integer> goodArray = new ArrayList<>();
            while (l <= r) {
                l += track;
                goodArray.add(l);
                track++;
            }

            System.out.println(goodArray.size() - 1);
        }
    }
}
