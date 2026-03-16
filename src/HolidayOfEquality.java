import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] welfare = new int[n];


        int max = 0;
        for (int i = 0; i < n; i++) {
            welfare[i] = input.nextInt();
            max = Math.max(max, welfare[i]);
        }

        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalCost += (max - welfare[i]);
        }
        System.out.print(totalCost);
    }
}
