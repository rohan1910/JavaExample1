import java.util.Scanner;

public class Qn6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in) ;
        System.out.println( " Enter number to print its multiplication tsble");
        int n = scanner.nextInt();

        for (int i = 1 ; i <=12 ; i++)
        {
            System.out.println(n + "*" + i + " = " + (n*i));
        }
    }
}


