
class Etudiant {
    String  nom;
    int     age;
    double  moyenne;

// public :
    public Etudiant(String n, int a, double m) {
        this.nom = n;
        this.age = a;
        this.moyenne = m;
    }
    public void afficherDetails() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Age : " + this.age);
        System.out.println("Moyenne : " + this.moyenne);
    }
    public boolean estAdmis() {
        return (this.moyenne >= 10);
    }

}

public class tp7 {
    public static void main(String[] args) {
        Etudiant    etu = new Etudiant("Yaaqoub", 20, 19.75);
        Etudiant    ishaq = new Etudiant("Ishaq", 18, 9.25);

        etu.afficherDetails();
        System.out.println(etu.estAdmis());

        System.out.println();

        ishaq.afficherDetails();
        System.out.println(ishaq.estAdmis());
    }
}