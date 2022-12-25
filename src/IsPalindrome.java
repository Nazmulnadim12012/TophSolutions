import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String S1 = S.toLowerCase();
        StringBuffer sb = new StringBuffer(S1);
        String S2= sb.reverse().toString();

        if (S1.equals(S2)){
            System.out.println("Yes");
        }else
            System.out.println("No");

    }
}
