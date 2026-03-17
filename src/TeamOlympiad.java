import java.util.ArrayList;
import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Integer> type1 = new ArrayList<>();
        ArrayList<Integer> type2 = new ArrayList<>();
        ArrayList<Integer> type3 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int skill = input.nextInt();

            if (skill == 1) {
                type1.add(i);
            } else if (skill == 2) {
                type2.add(i);
            } else {
                type3.add(i);
            }
        }

        int maxTeams = Math.min(type1.size(), Math.min(type2.size(), type3.size()));

        System.out.println(maxTeams);

        for (int i = 0; i < maxTeams; i++) {
            System.out.println(type1.get(i) + " " + type2.get(i) + " " + type3.get(i));
        }
    }
}