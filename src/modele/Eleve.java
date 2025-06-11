package modele;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Eleve {
    protected String nom;
    protected String prenom;
    protected String adresse1;
    protected String adresse2;
    protected String codePostal;
    protected String ville;

    protected double montantPaye;
    
    protected List<Cour> cours = new ArrayList<Cour>();


    public Eleve(String nom, String prenom, String adresse1, String adresse2, String codePostal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    //methodes
    public int coutTotal() {
        int total = 0;
        for (Cour cour : cours) {
            total += cour.cout;
        }
        return total;
    }

    public void ajouterCour(Cour cour) {
        cours.add(cour);
    }

    public void seDesinscrire(Cour cour) {
        cours.remove(cour);
    }

    public void payerCotisation() {
        // Logique pour payer la cotisation
        System.out.println("Cotisation payée pour " + nom + " " + prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

}
