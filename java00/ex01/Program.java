import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner scanStrem = new Scanner(System.in);

        int n = scanStrem.nextInt();
        if (n <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        boolean isPrime = true;
        int i = 2;
        while ( i <= Math.sqrt(n)) {
            if ( n % i == 0) {
                isPrime = false;
                break ;
            }
            i++;
        }

        System.out.println(isPrime + " " + (i - 1));
    }
}