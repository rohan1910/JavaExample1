import java.util.Scanner;

public class QN3 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter n terms ");
        int terms = scanner.nextInt();

        for (int i = 1; i <= terms; i++) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;

            System.out.print(n1 + "");


        }
    }
}

