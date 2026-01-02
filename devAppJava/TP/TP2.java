
import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer la premiere valeur (A) : ");
        int A = scanner.nextInt();

        System.out.print("Entrer la premiere valeur (B) : ");
        int B = scanner.nextInt();
        if (A > B)
            System.out.println("La Plus Grande Valeur est : " + A);
        else if (A < B)
            System.out.println("La Plus Grande Valeur est : " + B);
        else
            System.out.println("Les derux valeur sont egaux.");

        scanner.close();
    }
}