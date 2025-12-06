import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        if (!sc.hasNextInt()) {
            System.err.println("Veullez entrer une valeur int.");
            System.exit(-1);
        }
        int N = sc.nextInt();
        long resultat = 1;

        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                resultat *= i;
            }
            System.out.println("La factorielle de " + N + " est : " + resultat);
        }
        else System.out.println("Erreur : la factorielle n'est definie pour N<0");
        sc.close();
    }

}