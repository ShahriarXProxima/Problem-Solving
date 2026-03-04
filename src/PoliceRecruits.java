import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int officers = 0;
        int untreated = 0;

        for (int i = 0; i < n; i++) {
            int event = input.nextInt();

            if (event > 0) {
                officers += event;
            } else {
                if (officers > 0) {
                    officers--;
                } else {
                    untreated++;
                }
            }
        }

        System.out.print(untreated);
    }
}
