
class Employe {
    String nom;
    String prenom;
    double salaire;

    public Employe(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
    public void afficherDetails() {
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(salaire);

    }
}

class Manager extends Employe {
    double prime;

    public Manager(String nom, String prenom, double salaire,double prime) {
        super(nom, prenom, salaire);
        this.prime = prime;
    }
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println(prime);
    }

}


public class tp8 {
    public static void main(String args[]) {
        Employe e = new Employe("CHARKOUK", "Yaaqoub", 10000.00);
        Manager m = new Manager("CHARKOUK", "Ishaq", 12000.00, 1000.00);

        e.afficherDetails();
        m.afficherDetails();
    }
}