import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            Set<Integer> subSequence = new HashSet<>();
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                subSequence.add(input.nextInt());
            }

            System.out.println(subSequence.size());
        }
    }
}
