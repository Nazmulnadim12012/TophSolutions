import java.util.Scanner;

public class ClockMath {
    public static void main(String[] args) {
        int H,M;
        Scanner input = new Scanner(System.in);
        H = input.nextInt();
        M = input.nextInt();


        double angle = Math.abs((30*H)-(5.5*M));

        if (angle>180){
             double result = 360-angle;
            System.out.printf("%.7f\n",result);

        }else
            System.out.printf("%.7f\n",angle);
    }
}
