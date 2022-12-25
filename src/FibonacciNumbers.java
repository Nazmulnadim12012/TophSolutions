import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int fristNumber = 1;
        int secondNumber = 1;
        int fibo;
        System.out.print(fristNumber+","+secondNumber);

        for (int i = 2; i<=N; i++){
            fibo = fristNumber+secondNumber;
            System.out.print(","+fibo);
            fristNumber=secondNumber;
            secondNumber=fibo;


        }


    }
}
