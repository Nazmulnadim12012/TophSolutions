import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        for (int i=1;i<=A;i++){
            if (A%i == 0){
                System.out.println(+i);
            }

        }
    }
}
