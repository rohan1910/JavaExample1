import java.util.Scanner;

public class Qn7 {
    public static void main(String[] args) {
        int number = 0 ;
        int sum = 0 ;
        int avg ;
       System.out.println( "Enter 5 numbers ");

        for (int i=0 ; i<5 ; i++) {
            Scanner scanner = new Scanner(System.in) ;
            number = scanner.nextInt() ;

            sum += number ;
        }
        avg = sum/5 ;
        System.out.println( "Sum =" + sum);
        System.out.println( " Average = " + avg);

    }
}
