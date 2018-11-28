import java.util.Scanner;

public class Qn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println( " Enter number of term you want to cube ") ;
        int n = scanner.nextInt() ;

        for ( int i=1 ; i<=n ; i++) {
            System.out.println((i*i*i));
        }
    }
}
