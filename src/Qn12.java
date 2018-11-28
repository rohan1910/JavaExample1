import java.util.Scanner;

public class Qn12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println( " Enter loop limit ");
        int n = scanner.nextInt();
        System.out.println( "Numbers divisible by 3: ");
        for (int i=1 ; i<=n ; i++) {
            if (i%3 ==0)
                System.out.print(i + " ");
        }
        System.out.println( " Numbers divisible by 5: ");
        for (int i=1 ; i<=n ; i++) {
            if (i%5 ==0)
                System.out.print(i + " ");
        }
    }
}
