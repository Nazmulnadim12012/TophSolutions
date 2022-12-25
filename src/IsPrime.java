import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;
        for (int i = 2; i < N; i++) {

            if (N % i == 0) {
                count++;
                break;
            }

        }
        if (count!=0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}
