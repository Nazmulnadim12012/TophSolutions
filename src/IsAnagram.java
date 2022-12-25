import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        String A,B;
        boolean result;
        Scanner input = new Scanner(System.in);
        A = input.next().toLowerCase();
        B = input.next().toLowerCase();
        char [] x = A.toCharArray();
        char [] y = B.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        result = Arrays.equals(x,y);
        if (result==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
