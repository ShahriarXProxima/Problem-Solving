import java.util.ArrayList;
import java.util.Scanner;

public class GiftCarpet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt(), m = input.nextInt();
            ArrayList<String> table = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                table.add(input.next());
            }

            String target = "vika";
            int pos = 0;

            for (int i = 0; i < m && pos < 4; i++) {
                for (int j = 0; j < n; j++) {
                    if (table.get(j).charAt(i) == target.charAt(pos)) {
                        pos++;
                        break;
                    }
                }
            }

            System.out.println(pos == 4 ? "YES" : "NO");

        }
    }
}
