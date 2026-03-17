import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int y = input.nextInt();
            if (5 - y >= k) {
                count++;
            }
        }
        System.out.println(count / 3);
    }
}
