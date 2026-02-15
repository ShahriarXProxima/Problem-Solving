import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        String str = input.nextLine();
        int count_A = 0, count_D = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'A') {
                count_A++;
            } else {
                count_D++;
            }
        }

        if (count_A > count_D) {
            System.out.print("Anton");
        } else if (count_A < count_D) {
            System.out.print("Danik");
        } else {
            System.out.print("Friendship");
        }

    }
}
