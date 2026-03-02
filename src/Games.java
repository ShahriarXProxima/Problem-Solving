import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int games = input.nextInt();
        int[] host = new int[games];
        int[] guest = new int[games];
        int count = 0;

        for (int i = 0; i < games; i++) {
            host[i] = input.nextInt();
            guest[i] = input.nextInt();
        }

        for (int i = 0; i < games; i++) {
            for (int j = 0; j < games; j++) {
                if (i != j && host[i] == guest[j]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
