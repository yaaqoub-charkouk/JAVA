import java.util.Scanner;

public class tp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somme = 0;
        int nombreEtudians = 05;

        for (int i = 1; i <= nombreEtudians; i++) {
            System.out.print("Entrez la note de l'etudiant " + i + " : ");
            double note = sc.nextDouble();
            somme += note;
        }

        double moyenne = somme / nombreEtudians;
        System.out.println("La moyenne des notes est : " + moyenne);
        sc.close();
    }
}