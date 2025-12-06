import java.util.Scanner;

public class tp6 {
    public static void main(String[] args) {
        final int NB_ETUDIANT = 2;
        final int NB_NOTES = 5;
        double[][] etudiants = new double[NB_ETUDIANT][NB_NOTES];
        double[] moyennesNotes = new double[NB_ETUDIANT];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NB_ETUDIANT; i++) {
            System.out.println("Saisie des notes pour etudiant " + (i + 1));
            etudiants[i] = sasieNotes(sc, NB_NOTES);
            trieNotes(etudiants[i]);
            afficherNotes(etudiants[i]);
            moyennesNotes[i] = moyenneNotes(etudiants[i], NB_NOTES);
        }
        for (int i = 0; i < NB_ETUDIANT; i++) {
            System.out.print("Moyenne Et " + (i + 1) + " : ");
            System.out.println(moyennesNotes[i]);
        }
        sc.close();
    }


    static double[] sasieNotes(Scanner sc, int nbNotes) {
        

        double notes[];
        notes = new double[nbNotes];
        for (int i = 0; i < nbNotes; i++) {
            System.out.print("Veuillez entrer la note " + (i + 1) + " de l'etudiant : ");
            notes[i] = sc.nextDouble();
        }
        // sc.close();
        return (notes);
    }

    static double moyenneNotes(double[] notes, int nbNotes) {
        double somme = 0;

        for (int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }
        return (somme / nbNotes);
    }

    static void trieNotes(double[] notes) {
        for (int i = 0; i < notes.length - 1; i++) {
            for (int j = 0; j < notes.length - 1 - i; j++) {
                if (notes[j] < notes[j + 1]) {
                    double temp = notes[j];
                    notes[j] = notes[j + 1];
                    notes[j + 1] = temp;
                }
            }
        }
    }

    static void afficherNotes(double[] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i]);
            if (i < notes. length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}