import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 42)
                break ;
            int sum = digitSum(num);
            if (isPrime(sum))
                count++;
        }
        System.out.println("Count of coffee-request : " + count);
        sc.close();
    }


    static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return (sum);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return (false);
        }
        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if ( n % i == 0) {
                isPrime = false;
                break ;
            }
            i++;
        }
        return (isPrime);
    }
}