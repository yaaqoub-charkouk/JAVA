import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer la premiere valeur (A) : ");
        if (!scanner.hasNextInt()) {
            System.err.println("veuillez saisir un nombre int");
            System.exit(-1);
        }
        int A = scanner.nextInt();

        System.out.print("Entrer la premiere valeur (B) : ");
        if (!scanner.hasNextInt()) {
            System.err.println("veuillez saisir un nombre int");
            System.exit(-1);
        }
        int B = scanner.nextInt();

        System.out.print("Entrer l'operateur arithmethique : ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultat : " + (A + B));
                break;
            case '-':
                System.out.println("Resultat : " + (A - B));
                break;
            case '*':
                System.out.println("Resultat : " + (A * B));
                break;
            case '/':
                if (B != 0)
                    System.out.println("Resultat : " + (A / B));
                else
                    System.out.println("Le denominerateur B est null .");
                break;
            default:
                System.out.println("Operation invalide.");
        }

        scanner.close();
    }
}