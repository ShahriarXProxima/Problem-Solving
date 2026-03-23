import java.util.ArrayList;
import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String problem = input.next();

            ArrayList<Character> firstSolved = new ArrayList<>();
            firstSolved.add(problem.charAt(0));
            ArrayList<Character> secondSolved = new ArrayList<>();

            for (int i = 1; i < problem.length(); i++) {
                if (firstSolved.contains(problem.charAt(i))) {
                    secondSolved.add(problem.charAt(i));
                } else {
                    firstSolved.add(problem.charAt(i));
                }
            }

            int result = (firstSolved.size() * 2) + (secondSolved.size());
            System.out.println(result);
        }
    }
}
