import java.util.Arrays;
import java.util.Scanner;

public class LetterHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            int [] axis = new int[n+1];

            for(int i =0;i<n; i++){
                axis[i]= input.nextInt();
            }
            axis[n]= s;
            Arrays.sort(axis);


        }
    }
}
