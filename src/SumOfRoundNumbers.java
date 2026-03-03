import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = Integer.parseInt(input.nextLine());

        while (test-- > 0) {
            int count = 0;
            String value = input.nextLine();
            ArrayList<String> strings = new ArrayList<>();

            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == '0') {
                    continue;
                }
                count++;
            }
            System.out.println(count);

            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) != '0') {
                    int zerosNeeded = value.length() - i - 1;
                    String str = value.charAt(i) + "0".repeat(zerosNeeded);
                    strings.add(str);
                }
            }
            for(String num : strings){
                System.out.print( num +" ");
            }
        }
    }
}
